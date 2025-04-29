import java.util.Scanner;

public class ConvertLowerCase {
  public static String toLowerCaseManual(String s) {
    String result = "";
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (ch >= 'A' && ch <= 'Z') {
        ch = (char) (ch + 32);
      }
      result += ch;
    }
    return result;
  }

  public static boolean compareStrings(String s1, String s2) {
    if (s1.length() != s2.length())
      return false;
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) != s2.charAt(i))
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String text = input.nextLine();
    String manual = toLowerCaseManual(text);
    String builtIn = text.toLowerCase();
    boolean result = compareStrings(manual, builtIn);
    System.out.println("Manual: " + manual);
    System.out.println("Built-In: " + builtIn);
    System.out.println("Comparison Result: " + result);
  }
}
