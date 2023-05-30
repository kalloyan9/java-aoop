package test;

import functions.Functions;
import functions.Tabulate;
import services.Computable;

public class TabulateTest {

    public static void main(String[] args) {
        Tabulate t = new Tabulate(new services.Computable() {
            @Override
            public double function(double x) {
                return 1.0 / x;
            }
        });
        t.tabulate(10, 100, 10);

        t = new Tabulate(new Functions().getSinFunction());
        t.tabulate(1, 50, 25);
    }
}
