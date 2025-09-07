import java.util.Scanner;

public class Cipher {
    public static String encrypt(String text, int shift) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                encrypted.append((char) ((c - 'A' + shift) % 26 + 'A'));
            } else if (Character.isLowerCase(c)) {
                encrypted.append((char) ((c - 'a' + shift) % 26 + 'a'));
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - (shift % 26));
    }

    public static void displayAscii(String original, String encrypted) {
        System.out.println("Original ASCII:");
        for (char c : original.toCharArray()) {
            System.out.print((int) c + " ");
        }
        System.out.println("\nEncrypted ASCII:");
        for (char c : encrypted.toCharArray()) {
            System.out.print((int) c + " ");
        }
        System.out.println();
    }

    public static boolean validate(String original, String decrypted) {
        return original.equals(decrypted);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.nextLine();
        System.out.print("Enter shift value: ");
        int shift = input.nextInt();
        String encrypted = encrypt(text, shift);
        String decrypted = decrypt(encrypted, shift);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
        displayAscii(text, encrypted);
        System.out.println("Validation: " + validate(text, decrypted));
    }
}
