import java.util.Scanner;

public class CountdownUsingWhile {
  public static void main(String[] Args) {
    Scanner input = new Scanner(System.in);
    // taking input from user
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    input.close();
    // Counting down
    while (number >= 0) {
      System.out.println(number);
      number--;
    }

  }
}
