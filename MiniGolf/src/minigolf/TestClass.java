/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minigolf;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Jason Kerby
 */
public class TestClass {
    
    //this is just copying his example as a test.. compiler doesn't have any issues
    @Test
    public void testScoreDetailLegalInput(){
        final int[] correctScores = {1, 2, 3, 4};
        final Round r = new Round();
        int [] scores = r.scoreDetail();
        assertNotNull(scores);
        assertArrayEquals(correctScores, scores);
    }
}
