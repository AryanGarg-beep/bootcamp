import java.util.Scanner;

public class CharArrayCompare {
  public static char[] getChars(String s) {
    char[] chars = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      chars[i] = s.charAt(i);
    }
    return chars;
  }

  public static boolean compareArrays(char[] a, char[] b) {
    if (a.length != b.length)
      return false;
    for (int i = 0; i < a.length; i++) {
      if (a[i] != b[i])
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String text = input.next();
    char[] userChars = getChars(text);
    char[] builtInChars = text.toCharArray();
    boolean result = compareArrays(userChars, builtInChars);
    System.out.println("Comparison Result: " + result);
  }
}
