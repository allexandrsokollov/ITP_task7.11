import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }


    public static int getAmountOfMonotoneDecreasingSubsequences (int[] sequence) {
        int amountOfMonotoneDecreasingSubsequences = 0;
        boolean isPrevDecreasing = false;


        for (int i = 1; i < sequence.length; i++) {

            if (sequence[i] < sequence[i - 1] && !isPrevDecreasing) {
                amountOfMonotoneDecreasingSubsequences++;
                isPrevDecreasing = true;
            } else if (sequence[i] < sequence[i - 1] && isPrevDecreasing) {
                continue;
            } else {
                isPrevDecreasing = false;
            }

        }

        return amountOfMonotoneDecreasingSubsequences;
    }

    public static boolean isSecondSmaller (int a, int b) {
        return b < a;
    }

    public static int[] getIntArrFromConsole(String massage) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println(massage + " To stop entering enter not an integer");

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
