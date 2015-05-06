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
            for(int i=0; i < 3; i++){
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
        try{
            BufferedReader reader = new BufferedReader(new FileReader("Golf.txt"));
            while (reader.readLine() != null){
                numOfHoles ++;
            }
        }
        catch(Exception e){
            System.out.println("Error!");
        }
        numOfHoles = numOfHoles-3;
        return numOfHoles;
    }

    public static int parForHole(int hole) {
        //This method returns the par number for the requested hole
        int par = 4;
        return par;
    }

}
