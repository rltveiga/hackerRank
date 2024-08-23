package algorithms;

import org.junit.jupiter.api.Test;
import problemSolving.algorithms.SolveMeFirstAlgorith;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolveMeFirstAlgorithmTest {

    private SolveMeFirstAlgorith solveMeFirstAlgorithm;

    @Test
    public void solveMeFirstTest(){
        int result = SolveMeFirstAlgorith.solveMeFirst(1,1);
        assertEquals(2, result);
    }




}
