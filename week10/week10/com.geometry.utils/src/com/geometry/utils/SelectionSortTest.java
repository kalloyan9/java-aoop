package com.geometry.utils;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class SelectionSortTest {
    private static Comparable[] arrComparable = new Comparable[9];

    public static void main(String[] args) {
        Random random = new Random();

        int x, y, radius, height;
        for (int i = 0; i < 3; ++i) {
            x = random.nextInt(10, 51);
            y = random.nextInt(10, 51);

            arrComparable[i] = new Point(x, y);

            radius = random.nextInt(10, 31);
            arrComparable[i + 3] = new Circle(x, y, radius);

            height = random.nextInt(10, 61);
            arrComparable[i + 6] = new Cylinder(x, y, height);
        }

        System.out.println(Arrays.toString(arrComparable));
        System.out.println("\n");
        SelectionSort.sortArray(arrComparable);
        System.out.println(Arrays.toString(arrComparable));
    }
}
