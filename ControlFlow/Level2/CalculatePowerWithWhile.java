import java.util.Scanner;

public class CalculatePowerWithWhile{
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
    int counter = 0;

    while (counter < power) {
      result *= number;
      counter++;
    }

    // output the result
    System.out.println("Result: " + result);
  }
}
