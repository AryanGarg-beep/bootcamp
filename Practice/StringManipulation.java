import java.util.Scanner;
public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence with mixed formatting:");
        String input = scanner.nextLine();

        String trimmedString = input.trim();
        String replacedString = trimmedString.replace(" ", "_");
        String noDigitsString = replacedString.replaceAll("\\d", "");
        String[] wordsArray = noDigitsString.split("_");
        String joinedString = String.join(" | ", wordsArray);
        System.out.println("Processed String: " + joinedString);

        System.out.println("Removing punctuation: " + removePunctuation(joinedString));
        System.out.println("Capitalizing words: " + capitalizeWords(joinedString));
        System.out.println("Reversing word order: " + reverseWordOrder(joinedString));
        countWordFrequency(joinedString);
        scanner.close();
    }

    // Method to remove punctuation
    public static String removePunctuation(String text) {
        return text.replaceAll("[^a-zA-Z0-9_ |]", "");
    }

    // Method to capitalize each word
    public static String capitalizeWords(String text) {
        String[] words = text.split(" ");
        StringBuilder capitalized = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                capitalized.append(Character.toUpperCase(words[i].charAt(0)));
                if (words[i].length() > 1) {
                    capitalized.append(words[i].substring(1).toLowerCase());
                }
            }
            if (i < words.length - 1) {
                capitalized.append(" ");
            }
        }
        return capitalized.toString();
    }

    // Method to reverse word order
    public static String reverseWordOrder(String text) {
        String[] words = text.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }

    // Method to count word frequency
    public static void countWordFrequency(String text) {
        String[] words = text.split(" ");
        boolean[] counted = new boolean[words.length];
        for (int i = 0; i < words.length; i++) {
            if (!counted[i]) {
                int count = 1;
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        count++;
                        counted[j] = true;
                    }
                }
                System.out.println(words[i] + ": " + count);
            }
        }
    }
}