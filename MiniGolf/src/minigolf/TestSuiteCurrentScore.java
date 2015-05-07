//
//@author Haven Brewer
//@date May 6, 2015
//
//
package minigolf;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;

//Test to check to see if graded score has a value.

public class TestSuiteCurrentScore
{

    //sets up items used
    private Round r ;
    private int currentHoleNum ;
    
    //The player's scores for a full game
    //(I'm not sure how to read from a file through, sorry)
    private final int [ ] parScore = { 3 , 4 , 5 , 1 , 2 , 5 , 3 , 2 , 2 , 2 , 3 , 5 , 6 ,
        5 , 3 , 1 , 2 , 1 } ;
    
    //Overall Score
    private int currentScore ;

    @Before
    public void init ()
    {
        //Declare the values of the items used.
        r = new Round ( ) ; 
        currentHoleNum = 6 ;
        currentScore = 0 ;
        
        int i = currentHoleNum - 1 ; 
    }
    
    //Test 
    @Test
    public int testCurrentScoreValue( )
    {
        //Calculating graded score
        for (  int i = 0 ; i < currentHoleNum ; i ++ )
        {
            currentScore = currentScore + parScore [ i ] ;
            assertFalse ("higher than current Hole value", i > currentHoleNum ) ;
        }
        
        assertNull (currentScore); 
        
        return currentScore;
    } 
}