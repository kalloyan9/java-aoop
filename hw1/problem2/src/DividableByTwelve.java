/*
    Write a Console application in IntelliJ that computes the probability a five-digit number with the following
    properties is dividable by 12
    ✓ The first digit to be [1, 6]
    ✓ The second digit to be [4, 8]
    ✓ The third digit to be [3, 7]
    ✓ The fourth digit to be [1, 9]
    ✓ The fifth digit to be [1, 8]
    In addition to the computed probability compute the count of numbers with the above properties as
    well as the count of numbers dividable by 12.
    Note: Make use of String.format(), with appropriate format specifiers and control
    symbols to display the results on Standard output
 */

public class DividableByTwelve {
    public static void main(String[] args) {
        final int INTERVAL_START = 10000;
        final int INTERVAL_END = 70000;

        int totalCount = 0;
        int divisibleCount = 0;

        for (int i = INTERVAL_START; i < INTERVAL_END; i++) {
            String number = String.valueOf(i);

            if (number.charAt(0) >= '1' && number.charAt(0) <= '6' &&
            number.charAt(1) >= '4' && number.charAt(1) <= '8' &&
            number.charAt(2) >= '3' && number.charAt(2) <= '7' &&
            number.charAt(3) >= '1' && number.charAt(3) <= '9' &&
            number.charAt(4) >= '1' && number.charAt(4) <= '8') {

                totalCount++;

                if (i % 12 == 0) {
                    divisibleCount++;
                }
            }
        }

        // we have at least 1 number, so we don't divide by zero
        double probability = (double) divisibleCount / totalCount;

        System.out.println(String.format("Total count: %d", totalCount));
        System.out.println(String.format("Count of divisible numbers: %d", divisibleCount));
        // transform to percents
        System.out.println(String.format("Probability: %.2f%%", probability * 100));
    }
}
