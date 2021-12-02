package cs.vsu.sokolov;

import java.util.Locale;




public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        int[] seq = ArrayUtils.readIntArrayFromConsole();

        int amount = SequenceAnalyzer.getAmountOfMonotoneDecreasingSubsequences(seq);

        System.out.printf("amount: %d", amount);
    }



}
