import java.util.Scanner;
import java.util.Arrays;

public class TextProcessor{ 
     
    // TODO: Method to clean and validate input 
    public static String cleanInput(String input) { 
        // Remove extra spaces, convert to proper case 
        // Return cleaned string 
        if (input == null || input.trim().isEmpty()) {
            return "";
        }
        input = input.trim().replaceAll("\\s+", " ");
        String[] words = input.split(" ");
        StringBuilder cleaned = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                cleaned.append(Character.toUpperCase(word.charAt(0)))
                       .append(word.substring(1).toLowerCase())
                       .append(" ");
            }
        }
        return cleaned.toString().trim();

    } 
     
    // TODO: Method to analyze text 
    public static void analyzeText(String text) { 
        // Count: words, sentences, characters 
        // Find: longest word, most common character 
        // Display statistics 
        if(text == null || text.isEmpty()){
            System.out.println("No text provided for analysis.");
        }

        String[] words = text.split("\\s+");
        int sentenseCount = text.split("[.!?]").length;
        int wordCount = words.length;
        int charcount = text.replace(" ", "").length();
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        int counts[] = new int[26];
        String textLower = text.toLowerCase();
        for (char c : textLower.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                counts[c - 'a']++;
            }
        }


        System.out.println("Sentence Count: " + sentenseCount);     
        System.out.println("Word Count: " + wordCount);
        System.out.println("Character Count (excluding spaces): " + charcount);
        System.out.println("Longest Word: " + longestWord);
        System.out.print("Character Frequency: ");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.print((char) (i + 'a') + ": " + counts[i] + " ");
            }
        }
 
    } 
     
    // TODO: Method to create word array and sort alphabetically 
    public static String[] getWordsSorted(String text) { 
        // Split text into words, remove punctuation, sort 
        // Return sorted array 
        if (text == null || text.isEmpty()) {
            System.out.println("No text provided for sorting.");
            return new String[0]; 
        }
        String[] words = text.split("\\s+");
        for(int i=0;i<words.length;i++){
            StringBuilder cleaned = new StringBuilder();
            for (char c: words[i].toCharArray()) {
                if (Character.isLetter(c)) {
                    cleaned.append(c);
                }
            }
            words[i] = cleaned.toString();
        }
        Arrays.sort(words);
        return words;
    } 
     
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
         
        // TODO: Create a text processor that: 
        // 1. Asks user for a paragraph of text 
        // 2. Cleans and validates the input 
        // 3. Analyzes the text (word count, character count, etc.) 
        // 4. Shows the words in alphabetical order 
        // 5. Allows user to search for specific words 
        System.out.print("Please enter a paragraph of text: ");
        String inputText = scanner.nextLine();
         
        System.out.println("=== TEXT PROCESSOR ==="); 
        String cleanedText = cleanInput(inputText);
        System.out.println("Cleaned Text: " + cleanedText);

        analyzeText(cleanedText);
        String[] sortedArray = getWordsSorted(cleanedText); 
        System.out.println("\nSorted Words: " + Arrays.toString(sortedArray));

        //searching for a word
        System.out.println("=== SEARCH WORD ===");
        boolean found = false;
        System.out.print("Enter a word to search for: ");
        String searchWord = scanner.nextLine().trim();
        for (String word : sortedArray) {
            if (word.equalsIgnoreCase(searchWord)) {
                System.out.println("Word '" + searchWord + "' found in the text.");
                found = true;
                break;
                }
        }
        scanner.close();
    } 
}