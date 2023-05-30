package functions;

import services.Computable;

public class Functions {

    private class SinFunction implements Computable {

        // param x is in degrees
        @Override
        public double function(double x) {
            return Math.sin(Math.toRadians(x)); // conv to radians because of Math.sin
        }
    }

    public Computable getSinFunction() {
        return new SinFunction();
    }

    private class ExpFunction implements Computable {

        @Override
        public double function(double x) {
            return Math.exp(x);
        }
    }

    public Computable getExpFunction() {
        return new ExpFunction();
    }

}
