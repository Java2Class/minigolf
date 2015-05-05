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
   
}
