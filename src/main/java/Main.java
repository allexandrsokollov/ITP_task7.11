import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        String massage = "Enter your sequence. ";
        int[] seq = getIntArrFromConsole(massage);

        int amount = SequenceAnalyzer.getAmountOfMonotoneDecreasingSubsequences(seq);

        System.out.printf("amount: %d", amount);
    }



    public static int[] getIntArrFromConsole(String massage) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println(massage + " To stop entering enter not an integer\n");

        while (in.hasNextInt()) {
            arr.add(in.nextInt());
        }

        int[] ints = new int[arr.size()];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = arr.get(i);
        }

        return ints;
    }
}
