import java.util.Scanner;

public class TrimString {
  public static int findStartIndex(String s) {
    int start = 0;
    while (start < s.length() && s.charAt(start) == ' ') {
      start++;
    }
    return start;
  }

  public static int findEndIndex(String s) {
    int end = s.length() - 1;
    while (end >= 0 && s.charAt(end) == ' ') {
      end--;
    }
    return end;
  }

  public static String trim(String s) {
    int start = findStartIndex(s);
    int end = findEndIndex(s);
    if (start > end) {
      return "";
    }
    return s.substring(start, end + 1);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String s = input.nextLine();

    String trimmed = trim(s);
    String builtinTrimmed = s.trim();

    System.out.println("Custom Trimmed: \"" + trimmed + "\"");
    System.out.println("Built-in Trimmed: \"" + builtinTrimmed + "\"");
  }
}
