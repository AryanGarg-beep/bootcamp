import java.util.Arrays;

public class BasicStrArrayOps {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "date"};

        //lenght of the array
        System.out.println("Number of words: " + words.length);

        // Print each word in the array
        for (String word : words) {
            System.out.println(word);
        }

        // Find the length of each word
        for (String word : words) {
            System.out.println("Length of " + word + ": " + word.length());
        }

        // Concatenate all words into a single string
        StringBuilder concatenated = new StringBuilder();
        for (String word : words) {
            concatenated.append(word).append(" ");
        }
        System.out.println("Concatenated string: " + concatenated.toString().trim());

        //array bounds checking
        try {
            System.out.println("Accessing out of bounds index: " + words[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        //read only string loop

        for(String word:words ) {
            System.out.println("Word: " + word);
        }

        //array copying
        String[] copy = Arrays.copyOf(words, words.length);
        String[] partialCopy = Arrays.copyOfRange(words, 1, 3);
        System.out.println("Copied array: " + Arrays.toString(copy));
        System.out.println("Partial copied array: " + Arrays.toString(partialCopy));

    }
}