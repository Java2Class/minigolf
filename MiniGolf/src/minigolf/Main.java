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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    public static Round newRound ( String courseName, String playerName){
        //This method creates and stores a new Round object, and returns
        //a reference to that object --JS
        Round round = new Round();
        round.setCourseName(courseName);
        round.setPlayerName(playerName);
        return round;
    }   
    
    public static Round getRound ( String player, String courseName ){
        //This method looks up a round object
        Round getRound = new Round();
        return getRound;
    }
    
    public static Course getCourse ( String courseName ){
        //This method returns a course object
        Course course = new Course();
        return course;
    }
    
    public static int scoreSoFar ( String courseName, String playername ){
        //This method returns the current score to the swipe station
        int score = 0;
        return score;
    }
    
    public static void enterStrokes ( String courseName, String playerName, int strokes){
        //This method is used to enter stroke count for each hole        
    }    
    
}
