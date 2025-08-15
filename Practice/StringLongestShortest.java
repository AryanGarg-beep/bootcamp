import java.util.Scanner;

public class StringLongestShortest {

    public static String[] splitWords(String text) {
        int spaceCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') spaceCount++;
        }
        String[] words = new String[spaceCount + 1];
        int start = 0, wordIndex = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[wordIndex] = text.substring(start);
        return words;
    }

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static String[][] wordLengthArray(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(getLength(words[i]));
        }
        return arr;
    }

    public static int[] findShortestLongest(String[][] arr) {
        int minLen = Integer.MAX_VALUE, maxLen = Integer.MIN_VALUE;
        int minIdx = 0, maxIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            int len = Integer.parseInt(arr[i][1]);
            if (len < minLen) {
                minLen = len;
                minIdx = i;
            }
            if (len > maxLen) {
                maxLen = len;
                maxIdx = i;
            }
        }
        return new int[]{minIdx, maxIdx};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.nextLine();

        String[] words = splitWords(text);
        String[][] arr = wordLengthArray(words);
        int[] idx = findShortestLongest(arr);

        System.out.println("\nWord\tLength");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
        }

        System.out.println("\nShortest word: " + arr[idx[0]][0] + " (Length: " + arr[idx[0]][1] + ")");
        System.out.println("Longest word: " + arr[idx[1]][0] + " (Length: " + arr[idx[1]][1] + ")");
    }
}