import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter list2: ");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        int[] mergedList = merge(list1, list2);

        System.out.print("The merged list is: ");
        for (int i = 0; i < mergedList.length; i++) {
            System.out.print(mergedList[i] + " ");
        }
        System.out.println();
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] mergedList = new int[list1.length + list2.length];

        // merge
        int i = 0, j = 0, k = 0;
        while (i < list1.length && j < list2.length) {
            if (list1[i] < list2[j]) {
                mergedList[k++] = list1[i++];
            } else {
                mergedList[k++] = list2[j++];
            }
        }

        // merge in case of different len
        while (i < list1.length) {
            mergedList[k++] = list1[i++];
        }

        // merge in case of different len
        while (j < list2.length) {
            mergedList[k++] = list2[j++];
        }

        return mergedList;
    }
}
