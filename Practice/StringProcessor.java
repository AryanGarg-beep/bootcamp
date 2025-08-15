import java.util.Scanner;

public class StringProcessor {

    public static String[] splitString(String str){
        int spaceCount = 0;
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        String[] words = new String[spaceCount + 1];
        int start = 0, wordIndex = 0;
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                words[wordIndex++] = str.substring(start, i);
                start = i + 1;
            }
        }
        words[wordIndex] = str.substring(start);
        return words;
    }

    public static int length(String str){
        int count = 0;
        try {
            while (true) {
                char c = str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Make a 2D array of words and their length
    public static String[][] wordLengthArray(String[] words){
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(length(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = input.nextLine();
        String[] words = splitString(str);
        String[][] result = wordLengthArray(words);

        System.out.println("Word\tLength");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }
    }
}