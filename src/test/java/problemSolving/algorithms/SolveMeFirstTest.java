package problemSolving.algorithms;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolveMeFirstTest {

    private SolveMeFirst solveMeFirst;

    @Test
    public void solveMeFirstTest(){
        int result = SolveMeFirst.solveMeFirst(1,1);
        assertEquals(2, result);
    }
}
