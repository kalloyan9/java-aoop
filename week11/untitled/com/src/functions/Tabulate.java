package functions;

import services.Computable;

import java.util.Scanner;

public class Tabulate {
    private Computable callback;

    public Tabulate(Computable callback) {
        setCallback(callback);
    }

    public Computable getCallback() {
        return callback;
    }

    public void setCallback(Computable callback) {
        if (callback == null) {
            this.callback = new Functions().getExpFunction();
        } else {
            this.callback = callback;
        }

    }

    public void tabulate( double a, double b, int steps) {
        tabulateFunction(a, b, steps, callback);
    }

    public static void tabulateFunction( double a, double b,
                                         int steps, Computable computable) {
        if (a >= b) {
            System.out.println("invalid interval");
            return;
        }
        if (steps < 1) {
            System.out.println("invalid steps");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        double x;
        int size = (int) (b - a) / steps;

        System.out.printf("%-14s%-14s%n", "X", "F(X)");
        for (int i = 0; i < size; ++i) {
            x = a + i * size;
            System.out.printf("%-10.2f%-10.3%n", x, computable.function(x));

            if (i % 20 == 0 && i != 0) {
                System.out.println("Press Return to continue...");
                scanner.nextLine();
            }
        }
    }

    public double function(double x);
}
