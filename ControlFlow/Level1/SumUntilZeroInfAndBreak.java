import java.util.Scanner;

public class SumUntilZeroInfAndBreak {
  public static void main(String[] args) {
    double total = 0.0;
    Scanner input = new Scanner(System.in);
    Double userInput;

    while (true) {
      System.out.print("Enter a number (0 to stop): ");
      userInput = input.nextDouble();
      if (userInput == 0) {
        break;
      }
      total += userInput;
    }
    System.out.println("The total sum is: " + total);
    input.close();
  }
}
