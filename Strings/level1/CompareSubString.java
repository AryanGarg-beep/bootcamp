import java.util.Scanner;

public class CompareSubString {
  public static String getSubString(String s, int start, int end) {
    String result = "";
    for (int i = start; i < end; i++) {
      result += s.charAt(i);
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = input.next();
    int start = input.nextInt();
    int end = input.nextInt();
    String subString = getSubString(s, start, end);
    String javaSubString = s.substring(start, end);
    boolean compare = subString.equals(javaSubString);
    System.out.println("subString: " + subString);
    System.out.println("Comparision: " + compare);
  }
}
