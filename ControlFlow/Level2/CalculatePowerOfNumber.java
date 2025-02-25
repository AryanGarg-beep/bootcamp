import java.util.Scanner;

public class CalculatePowerOfNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // taking user input
    System.out.print("Enter number: ");
    int number = input.nextInt();
    System.out.print("Enter power: ");
    int power = input.nextInt();
    input.close();

    // power calculation
    int result = 1;
    for (int i = 1; i <= power; i++) {
      result *= number;
    }

    // output the result
    System.out.println("Result: " + result);
  }
}
