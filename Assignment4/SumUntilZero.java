import java.util.Scanner;

public class SumUntilZero {
  public static void main(String[] args) {
    double total = 0.0; // Initialize total
    Scanner scanner = new Scanner(System.in);
    double userInput;

    // Input
    System.out.print("Enter a number (0 to stop): ");
    userInput = scanner.nextDouble();

    while (userInput != 0) {
      total += userInput; // Add to total

      // Input
      System.out.print("Enter a number (0 to stop): ");
      userInput = scanner.nextDouble();
    }

    System.out.println("The total sum is: " + total); // Output
    scanner.close();
  }
}
