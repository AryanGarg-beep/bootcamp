import java.util.Scanner;

public class CompareString {
  public static boolean compare(String s1, String s2) {
    if (s1.length() != s2.length())
      return false;
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) != s2.charAt(i)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s1 = input.next();
    String s2 = input.next();
    boolean myResult = compare(s1, s2);
    boolean javaResult = s1.equals(s2);
    System.out.println("My Result: " + myResult);
    System.out.println("Java Result: " + javaResult);
  }
}
