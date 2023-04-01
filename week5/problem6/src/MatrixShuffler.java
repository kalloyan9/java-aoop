import java.util.Random;

public class MatrixShuffler {

    public static void shuffle(int[][] m) {
        // create instance of Random
        Random rand = new Random();
        // cycle the lines of the matrix
        for (int i = 0; i <  m.length - 1; i++) {
            // generate random number in valid interval
            int j = rand.nextInt(i + 1);
            // swap
            int[] temp = m[i];
            m[i] = m[j];
            m[j] = temp;
        }
    }

    public static void main(String[] args) {
        // test:
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        shuffle(m);
        // print the array
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
