import java.util.Scanner;

public class IllegalArgument {
  public static void generateException(String text) {
    System.out.println(text.substring(5, 2));
  }

  public static void handleException(String text) {
    try {
      System.out.println(text.substring(5, 2));
    } catch (IllegalArgumentException e) {
      System.out.println("IllegalArgumentException caught");
    } catch (RuntimeException e) {
      System.out.println("RuntimeException caught");
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String text = input.next();
    generateException(text);
    handleException(text);
  }
}
