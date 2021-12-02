package cs.vsu.sokolov;

public class SequenceAnalyzer {

    public static int getAmountOfMonotoneDecreasingSubsequences (int[] sequence) {
        int amountOfMonotoneDecreasingSubsequences = 0;
        boolean isPrevDecreasing = false;


        for (int i = 1; i < sequence.length; i++) {

            if (sequence[i] < sequence[i - 1] && !isPrevDecreasing) {
                amountOfMonotoneDecreasingSubsequences++;
                isPrevDecreasing = true;

            } else if (!(sequence[i] < sequence[i - 1])) {
                isPrevDecreasing = false;
            }

        }

        return amountOfMonotoneDecreasingSubsequences;
    }
}
