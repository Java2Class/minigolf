/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minigolf;

/**
 *
 * @author John Silvey
 */
public class Course {
    
    public static String getName(){
        //This method returns the course name
        String courseName = name;
        return courseName;
    }
    
    public static int getNumberOfHoles(){
        //This method returns the number of holes on the course
        int numOfHoles=18;
        return numOfHoles;
    }
    
    public static int parForHole( int hole ){
        //This method returns the par number for the requested hole
        int par = 4;
        return par;
    }
    
}
