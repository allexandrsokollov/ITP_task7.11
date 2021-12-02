import cs.vsu.sokolov.SequenceAnalyzer;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SequenceAnalyzerTest {

    @Test
    public void getAmountOfMonotoneDecreasingSubsequences() {
        int[][] inputData = {
                {1},
                {1,2},
                {2,1},
                {},
                {1,2,3,4,5,6,7},
                {7,6,5,4,3,2,1,0},
                {1,2,1,2,1,2,1,2},
                {2,1,2,1,2,1,2,1,2,1,2,1},
                {1,2,3,3,2,1,3,2,1,3,2,1},
                {3,2,1},
                {1,2,3,1},
                {1,1,1,1,1,1,1,1},
                {3,2,1,0,0,0,0,0},

        };

        int[] expectedResults = { 0, 0, 1, 0, 0, 1, 3, 6, 3, 1, 1, 0, 1 };

        for(int i = 0; i < expectedResults.length; i++) {
            int actual = SequenceAnalyzer.getAmountOfMonotoneDecreasingSubsequences(inputData[i]);

            System.out.println(Arrays.toString(inputData[i]));
            System.out.printf("expected value: %d    actual value: %d\n\n" ,expectedResults[i], actual);

            assertEquals(expectedResults[i], actual);
        }
    }
}