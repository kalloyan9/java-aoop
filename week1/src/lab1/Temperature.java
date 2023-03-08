package lab1;

import java.util.Scanner;

public class Temperature {
    Scanner input = new Scanner(System.in);
    void convFahrenheitToCelsius() {
        double fahrenheit;
        double celsius;
        // shortcut: sout + enter == system out print line
        System.out.println("Enter temperature in Fahrenheit:\n");
        fahrenheit = input.nextDouble();
        celsius = 5.0 / 9.0 * (fahrenheit - 32);
        System.out.println("Temperature " + fahrenheit + " in Fahrenheit equals to " + celsius + " in Celsius\n");
    }

    void convCelsiusToFahrenheit() {
        double celsius;
        double fahrenheit;
        System.out.println("Enter temperature in Celsius:\n");
        celsius = input.nextDouble();
        fahrenheit = 5.0 / 9.0 * celsius + 32;
        // printf - for formatted out
        // %f - floating, %.2f - 1 zakrugleno do 2 znaka sled deset. zapetaq
        System.out.printf("%.1f %s", fahrenheit, " Fahrenheit");
    }

    // shortcut: psmv + enter == public static void maintemplate
    void run() {
        System.out.println("Type 1 - for F to C conv.\nType 2 - for C to F conv.\n");
        int option = input.nextInt();
        if (option == 1) {
            convFahrenheitToCelsius();
        } else if (option == 2) {
            convCelsiusToFahrenheit();
        } else {
            System.out.println("invalid input.\n");
        }
    }
}
