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
public class Round {
    private String courseName;
    private String playerName;
    //int array to hold scores for each hole
    public int[] scores = new int[18];
    
    //getters and setters for courseName and PlayerName
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    
    public int[] scoreDetail(){
        //Returns the array of strokes per hole
        return scores;
    }
    
    public int currentScore(){
        //Display the user's score so far        
        int currentScore=0;
        return currentScore;
    }
    
    public int numberOfHolesPlayed(){
        //Returns the number of completed holes this round
        int numOfHolesPlayed = 0;
        return numOfHolesPlayed;
    }
    
    public void enterScore(int strokes){
        //Enter a score for the next hole. 
        int currentHole=0;
        scores[currentHole]=strokes;
    }   
       
}
