import java.util.Random;
import java.text.NumberFormat;

public class Main {
    final static int N = 10;
    final static int SET[] = {1,1,2,2,2,3,3,3,3,3};
    private static int drawRandomNumber() {
        Random random = new Random();
        return SET[random.nextInt(N)];
    }
    public static void main(String[] args) {
        // test 10K times:
        int countOne = 0;
        int countTwo = 0;
        int countThree = 0;

        for (int i = 0; i < 10_000; ++i) {
            int res = drawRandomNumber();
            if (res == 1) {
                ++countOne;
            } else if (res == 2) {
                ++countTwo;
            } else { // res == 3
                ++countThree;
            }
        }

        System.out.println("Results from the loop of 10 000 times:");
        System.out.println("probability returned 1: " + countOne / 10000.0 +
                " (" + NumberFormat.getPercentInstance().format(countOne / 10000.0) + ")");
        System.out.println("probability returned 2: " + countTwo / 10000.0 +
                " (" + NumberFormat.getPercentInstance().format(countTwo / 10000.0) + ")");
        System.out.println("probability returned 3: " + countThree / 10000.0 +
                " (" + NumberFormat.getPercentInstance().format(countThree / 10000.0) + ")");
        System.out.println();

        // test 60K times:
        countOne = 0;
        countTwo = 0;
        countThree = 0;

        for (int i = 0; i < 60_000; ++i) {
            int res = drawRandomNumber();
            if (res == 1) {
                ++countOne;
            } else if (res == 2) {
                ++countTwo;
            } else { // res == 3
                ++countThree;
            }
        }

        System.out.println("Results from the loop of 60 000 times:");
        System.out.println("probability returned 1: " + countOne / 60000.0 +
                " (" + NumberFormat.getPercentInstance().format(countOne / 60000.0) + ")");
        System.out.println("probability returned 2: " + countTwo / 60000.0 +
                " (" + NumberFormat.getPercentInstance().format(countTwo / 60000.0) + ")");
        System.out.println("probability returned 3: " + countThree / 60000.0 +
                " (" + NumberFormat.getPercentInstance().format(countThree / 60000.0) + ")");

    }
}