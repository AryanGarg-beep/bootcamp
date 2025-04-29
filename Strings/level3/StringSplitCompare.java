import java.util.Scanner;

public class StringSplitCompare {
  public static String[] customSplit(String s) {
    int count = 1;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ' ') {
        count++;
      }
    }
    String[] words = new String[count];
    int index = 0, start = 0;
    for (int i = 0; i <= s.length(); i++) {
      if (i == s.length() || s.charAt(i) == ' ') {
        String word = "";
        for (int j = start; j < i; j++) {
          word += s.charAt(j);
        }
        words[index++] = word;
        start = i + 1;
      }
    }
    return words;
  }

  public static boolean compareArrays(String[] a, String[] b) {
    if (a.length != b.length)
      return false;
    for (int i = 0; i < a.length; i++) {
      if (!a[i].equals(b[i]))
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    String[] custom = customSplit(s);
    String[] builtin = s.split(" ");
    boolean result = compareArrays(custom, builtin);
    System.out.println("Match: " + result);
  }
}
