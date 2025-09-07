import java.util.Scanner;

public class ConvertWithASCII {

    static String convertToUppercase(String str){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result.append(ch);
        }
        return result.toString();
    }
    static String convertToLowercase(String str){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result.append(ch);
        }
        return result.toString();
    }
    static String TitleCase(String str){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i == 0 || str.charAt(i - 1) == ' ') {
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char) (ch - 32);
                }
            } else {
                if (ch >= 'A' && ch <= 'Z') {
                    ch = (char) (ch + 32);
                }
            }
            result.append(ch);
        }
        return result.toString();
    }
    static void compareString(String str) {
        String upperCaseStr = convertToUppercase(str);
        String javaUpperCaseStr = str.toUpperCase();
        String lowerCaseStr = convertToLowercase(str);
        String javaLowerCaseStr = str.toLowerCase();
        System.out.println("--------------------------------------------------");
        System.out.printf("%-20s | %-20s%n", "Custom UpperCase", "Java UpperCase");
        System.out.printf("%-20s | %-20s%n", upperCaseStr, javaUpperCaseStr);
        System.out.println(upperCaseStr.equals(javaUpperCaseStr) ? "\t\t   Equal" : "\t\t   Not Equal");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-20s | %-20s%n", "Custom Lowercase", "Java Lowercase");
        System.out.printf("%-20s | %-20s%n", lowerCaseStr, javaLowerCaseStr);
        System.out.println(lowerCaseStr.equals(javaLowerCaseStr) ? "\t\t   Equal" : "\t\t   Not Equal");
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = input.nextLine();
        System.out.println("Uppercase: " + convertToUppercase(str));
        System.out.println("Lowercase: " + convertToLowercase(str));
        System.out.println("Title Case: " + TitleCase(str));
        compareString(str);
        input.close();

    }

}
