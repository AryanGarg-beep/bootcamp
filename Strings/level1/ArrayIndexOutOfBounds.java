import java.util.Scanner;

public class ArrayIndexOutOfBounds {
  public static void generateException(String[] names) {
    System.out.println(names[names.length]);
  }

  public static void handleException(String[] names) {
    try {
      System.out.println(names[names.length]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBoundsException caught");
    } catch (RuntimeException e) {
      System.out.println("RuntimeException caught");
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    String[] names = new String[size];
    for (int i = 0; i < size; i++) {
      names[i] = input.next();
    }
    generateException(names);
    handleException(names);
  }
}
