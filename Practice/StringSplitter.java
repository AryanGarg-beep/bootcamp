import java.util.Scanner;
/*Create a Method to split the text into words using the charAt() method 
without using the String built-in split() method and return the words. 
Use the following logic i. Firstly Count the number of words in the text 
and create an array to store the indexes of the spaces for each word in a 1D array 
 */

public class StringSplitter {

    public static String[] splitString(String str){
        int spaceCount = 0;
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        String[] words = new String[spaceCount + 1];
        for(int i = 0, j = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                words[j++] = str.substring(0, i);
                str = str.substring(i + 1);
                i = -1; 
            }
        }
        words[spaceCount] = str; 
        return words;
    }

    public static boolean compare(String[] words, String str){
        boolean isEqual = true;
        String[] words2 = str.split(" ");
        if (words.length != words2.length) {
            isEqual = false;
        } else {
            for (int i = 0; i < words.length; i++) {
                if (!words[i].equals(words2[i])) {
                    isEqual = false;
                    break;
                }
            }
        }
        return isEqual;

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = input.nextLine();
        String[] words = splitString(str);
        System.out.println("Words in the string:");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("Comparision: " + compare(words, str));
        input.close();

    }
}