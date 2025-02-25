import java.util.Scanner;

public class CountdownUsingFor {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // taking input from user
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    input.close();
    // counting down
    for (int i = number; i >= 0; i--) {
      System.out.println(i);
    }
  }
}
