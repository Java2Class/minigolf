/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minigolf;

import java.io.*;
import java.util.*;

/**
 *
 * @author John Silvey
 */
public class Course {

    public static String getName() {
        //This method returns the course name, address, and zip code
        File f = new File("Golf.txt");
        StringBuilder sb = new StringBuilder();
        try {
            Scanner s = new Scanner(f);
            for (int i = 0; i < 3; i++) {
                sb.append(s.nextLine() + "\n");
            }
        } catch (Exception e) {
            System.out.println("Error!");
        }

        String courseName = sb.toString();
        return courseName;
    }

    public static int getNumberOfHoles() {
        //This method returns the number of holes on the course
        int numOfHoles = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Golf.txt"));
            while (reader.readLine() != null) {
                numOfHoles++;
            }
        } catch (Exception e) {
            System.out.println("Error!");
        }
        numOfHoles = numOfHoles - 3;
        return numOfHoles;
    }

    public static int parForHole(int hole) {
        //This method returns the par number for the requested hole
        int par=0;
        int i = 0;
        Map<String, String> holePar = new HashMap<String, String>();
        String s;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Golf.txt"));
            while ((s = reader.readLine()) != null) {
                i++;
                if (i > 3) {
                        String[] pairs = s.split(",");
                        holePar.put(pairs[0], pairs[1]);
                }
            }
            String value = holePar.get(String.valueOf(hole));
            par = Integer.parseInt(value);
        } catch (Exception e) {
            System.out.println("Error!");
        }
        return par;
    }

}
