package lab13problem2;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.function.*;

public class LambdaTest {
    public static void main(String[] args) {
        // 1st option
        Function<Integer, String> function =
                (number) -> {
            return "Number is " + number;
        };

        // 2nd option
        Function<Integer, String> function2 =
                (number) -> "Number is " + number;

        System.out.println("Function2 test: " +
                function2.apply(13) + "\n" +
                "Function test: " +
                function.apply(13) + "\n");

        BiPredicate<Double, Double> biPredicate =
                (d1, d2) -> {
                    return (d1.compareTo(d2)) > 0;
                };

        System.out.println("BiPredicate test " + biPredicate.test(13.0, 15.5) + "\n");

        BiConsumer<String, String> biConsumer =
                (str1, str2) -> {
                    System.out.println(str1 + str2 + "\n");
                };
        System.out.println("BiConsumer test ");
        biConsumer.accept("kzc", "1914");

        Supplier<int[]> supplier =
                () -> {
                    int[] testSupplier = new int[10];
                    Arrays.fill(testSupplier, 3);
                    return testSupplier;
                };

        System.out.println("Supplier test: " +
        Arrays.toString(supplier.get()) + "\n");

        IntFunction<double[]> intFunction =
                (size) -> {
                    double[] darr = new double[size];
                    Arrays.fill(darr, size);
                    return darr;
                };
        System.out.println("IntFunction test: " + Arrays.toString(intFunction.apply(7)) + " ");

        Function<Double, Double> cosFunc = Math::cos;
        System.out.println("cosFunc test: " + cosFunc.apply(0.0) + "\n");

        Runnable task = () -> System.out.println("task run");
        for (int i = 0; i < 10; ++i) {
            task.run();
        }
    }
}
