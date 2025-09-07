public class StringBuiltInMethods {
    public static void main(String[] args) {
        String sampleText = " Java Programming is Fun and Challenging! ";

        // 1. Display original string length including spaces
        System.out.println("Original String: "+ sampleText);
        System.out.println("Original Length (including spaces): " + sampleText.length());

        // 2. Remove leading and trailing spaces, show new length
        String trimmedText = sampleText.trim();
        System.out.println("Trimmed String:" + trimmedText );
        System.out.println("Trimmed Length: " + trimmedText.length());

        // 3. Find and display the character at index 5
        System.out.println("Character at index 5: " + sampleText.charAt(5));

        // 4. Extract substring "Programming" from the text
        int progStart = sampleText.indexOf("Programming");
        String programmingSubstring = sampleText.substring(progStart, progStart + "Programming".length());
        System.out.println("Extracted Substring: " + programmingSubstring);

        // 5. Find the index of the word "Fun"
        int funIndex = sampleText.indexOf("Fun");
        System.out.println("Index of \"Fun\": " + funIndex);

        // 6. Check if the string contains "Java" (case-sensitive)
        boolean containsJava = sampleText.contains("Java");
        System.out.println("Contains \"Java\": " + containsJava);

        // 7. Check if the string starts with "Java" (after trimming)
        boolean startsWithJava = trimmedText.startsWith("Java");
        System.out.println("Starts with \"Java\" (after trim): " + startsWithJava);

        // 8. Check if the string ends with an exclamation mark
        boolean endsWithExclamation = trimmedText.endsWith("!");
        System.out.println("Ends with '!': " + endsWithExclamation);

        // 9. Convert the entire string to uppercase
        System.out.println("Uppercase: " + sampleText.toUpperCase());

        // 10. Convert the entire string to lowercase
        System.out.println("Lowercase: " + sampleText.toLowerCase());

        // Count vowels using charAt()
        int vowelCount = countVowels(sampleText);
        System.out.println("Number of vowels: " + vowelCount);

        // Find all occurrences of character 'a'
        System.out.print("Occurrences of 'a': ");
        findAllOccurrences(sampleText, 'a');
    }

    // Method to count vowels in a string
    public static int countVowels(String text) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < text.length(); i++) {
            if (vowels.indexOf(text.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    // Method to find all positions of a character
    public static void findAllOccurrences(String text, char target) {
        boolean found = false;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("None");
        }
        System.out.println();
    }
}