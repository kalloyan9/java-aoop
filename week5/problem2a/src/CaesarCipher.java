import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operation:");
        System.out.println("1 - Encrypt plaintext");
        System.out.println("2 - Decrypt ciphertext");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.println("Enter plaintext:");
            String plaintext = scanner.nextLine().toUpperCase();

            char[] plaintextChars = plaintext.toCharArray();
            char[] ciphertextChars = new char[plaintextChars.length];

            for (int i = 0; i < plaintextChars.length; i++) {
                char currentChar = plaintextChars[i];
                if (currentChar >= 'A' && currentChar <= 'Z') {
                    int shiftedChar = (currentChar - 'A' + 3) % 26 + 'A';
                    ciphertextChars[i] = (char) shiftedChar;
                } else {
                    ciphertextChars[i] = currentChar;
                }
            }

            String ciphertext = new String(ciphertextChars);
            System.out.println("Ciphertext: " + ciphertext);
        } else if (choice == 2) {
            System.out.println("Enter ciphertext:");
            String ciphertext = scanner.nextLine().toUpperCase();

            char[] ciphertextChars = ciphertext.toCharArray();
            char[] plaintextChars = new char[ciphertextChars.length];

            for (int i = 0; i < ciphertextChars.length; i++) {
                char currentChar = ciphertextChars[i];
                if (currentChar >= 'A' && currentChar <= 'Z') {
                    int shiftedChar = (currentChar - 'A' - 3 + 26) % 26 + 'A';
                    plaintextChars[i] = (char) shiftedChar;
                } else {
                    plaintextChars[i] = currentChar;
                }
            }

            String plaintext = new String(plaintextChars);
            System.out.println("Plaintext: " + plaintext);
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
