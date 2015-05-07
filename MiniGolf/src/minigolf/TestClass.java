/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minigolf;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

/**
 *
 * @author Jason Kerby
 */
public class TestClass {

    //TEST ROUND: scoreDetail LEGAL
    @Test
    public void scoreDetailLegal() {
        final int[] correctScores = {1, 2, 3, 4};
        final Round r = new Round();
        int[] scores = r.scoreDetail();
        assertNotNull(scores);
        assertArrayEquals(correctScores, scores);
    }

    //TEST ROUND: scoreDetail ILLEGAL
    @Test
    public void scoreDetailIllegal() {
        final int[] illegalScores = {-1, -2, -3, -4};
        final Round r = new Round();
        int[] scores = r.scoreDetail();
        assertNotNull(scores);
        assertArrayEquals(illegalScores, scores);
    }
    
    //TEST ROUND: numOfHolesPlayed LEGAL
    @Test
    public void numberOfHolesPlayedLegal() {
        final Round r = new Round();
        int holes = r.numberOfHolesPlayed();
        assertNotNull(holes);
        assertTrue(!(holes < 0) && (holes < 18));
    }
    
    //TEST ROUND: numOfHolesPlayed ILLEGAL
    @Test
    public void numberOfHolesPlayedIllegal() {
        final Round r = new Round();
        int holes = r.numberOfHolesPlayed();
        assertNull(holes);
        assertFalse(!(holes < 0) || (holes < 18));
    }
    
    //TEST ROUND: enterScore LEGAL
    @Test
    public void enterScoreLegal(){
        final Round r = new Round();
        final int[] strokes = {1,2,3,4,5,6,7,8,9,10};
           for (int i = 0; i < strokes.length; i ++){
               r.enterScore(strokes[i]);
               assertNotNull(strokes[i]);
               assertTrue(!(strokes[i] <= 0) && (strokes[i] > 10));
           }
    }
    
    //TEST ROUND: enterScore ILLEGAL
    @Test
    public void enterScoreIllegal(){
        final Round r = new Round();
        final int[] strokes = {-4,-3,-2,-1,0,10,11,12,13};
        for (int i = 0; i < strokes.length; i++){
            r.enterScore(strokes[i]);
            assertNull(strokes);
            assertFalse(!(strokes[i] > 0) && (strokes[i] <= 10));
        }
        
    }
}
