import java.util.Scanner;

public class FindAndReplace {
    static int[] FindSubString(String sentence, String subString, String replacement) {
        java.util.List<Integer> indices = new java.util.ArrayList<>();
        int len = subString.length();
        for (int i = 0; i <= sentence.length() - len; i++) {
            boolean match = true;
            for (int j = 0; j < len; j++) {
                if (sentence.charAt(i + j) != subString.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                indices.add(i);
            }
        }
        int[] result = new int[indices.size()];
        for (int i = 0; i < indices.size(); i++) {
            result[i] = indices.get(i);
        }
        return result;
    }

    static String ReplaceSubString(String sentence, String subString, String replacement) {
        int[] indices = FindSubString(sentence, subString, replacement);
        if (indices.length == 0) {
            return sentence;
        }
        StringBuilder result = new StringBuilder();
        int lastIndex = 0;
        for (int index : indices) {
            for (int i = lastIndex; i < index; i++) {
                result.append(sentence.charAt(i));
            }
            result.append(replacement);
            lastIndex = index + subString.length();
        }
        for (int i = lastIndex; i < sentence.length(); i++) {
            result.append(sentence.charAt(i));
        }
        return result.toString();
    }

    static Boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = input.nextLine();
        System.out.println("Enter the subString:");
        String subString = input.nextLine();
        System.out.println("Enter the replacement:");
        String replacement = input.nextLine();
        input.close();

        int[] indices = FindSubString(sentence, subString, replacement);
        if (indices.length == 0) {
            System.out.println("No substring instance");
        } else {
            System.out.println("Indices of occurrences: ");
            for (int index : indices) {
                System.out.print(index + " ");
            }
        }
        String modifiedString = ReplaceSubString(sentence, subString, replacement);
        System.out.println("\nModified sentence: " + modifiedString);
        System.out.println("Comparing strings: " + compareStrings(sentence, modifiedString));
    }
}
