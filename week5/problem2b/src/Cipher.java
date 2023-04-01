import java.util.Scanner;

public class Cipher {
    private int cipherKey;
    private char[][] matrix;

    public Cipher(int cipherKey) {
        this.cipherKey = cipherKey;
    }

    public String encrypt(String plaintext) {
        int numCols = (int) Math.ceil((double) plaintext.length() / cipherKey);
        matrix = new char[cipherKey][numCols];
        int index = 0;

        for (int col = 0; col < numCols; col++) {
            for (int row = 0; row < cipherKey; row++) {
                if (index < plaintext.length()) {
                    matrix[row][col] = plaintext.charAt(index);
                    index++;
                } else {
                    matrix[row][col] = ' ';
                }
            }
        }

        StringBuilder ciphertext = new StringBuilder();

        for (int row = 0; row < cipherKey; row++) {
            for (int col = 0; col < numCols; col++) {
                ciphertext.append(matrix[row][col]);
            }
        }

        return ciphertext.toString();
    }

    public String decrypt(String ciphertext) {
        int numCols = (int) Math.ceil((double) ciphertext.length() / cipherKey);
        matrix = new char[cipherKey][numCols];
        int index = 0;

        for (int row = 0; row < cipherKey; row++) {
            for (int col = 0; col < numCols; col++) {
                matrix[row][col] = ciphertext.charAt(index);
                index++;
            }
        }

        StringBuilder plaintext = new StringBuilder();

        for (int col = 0; col < numCols; col++) {
            for (int row = 0; row < cipherKey; row++) {
                plaintext.append(matrix[row][col]);
            }
        }

        return plaintext.toString().replace(" ", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter plaintext to encrypt: ");
        String plaintext = scanner.nextLine();
        System.out.print("Enter key text: ");
        String keyText = scanner.nextLine();

        int cipherKey = keyText.length();
        Cipher cipher = new Cipher(cipherKey);
        String ciphertext = cipher.encrypt(plaintext);

        System.out.println("Encrypted text: " + ciphertext);
        System.out.print("Enter ciphertext to decrypt: ");
        ciphertext = scanner.nextLine();
        plaintext = cipher.decrypt(ciphertext);
        System.out.println("Decrypted text: " + plaintext);
    }
}
