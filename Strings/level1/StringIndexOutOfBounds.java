import java.util.Scanner;

public class StringIndexOutOfBounds {
  public static void generateException(String text) {
    System.out.println(text.charAt(text.length()));
  }

  public static void handleException(String text) {
    try {
      System.out.println(text.charAt(text.length()));
    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("StringIndexOutOfBoundsException caught");
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String text = input.next();
    generateException(text);
    handleException(text);
  }
}
