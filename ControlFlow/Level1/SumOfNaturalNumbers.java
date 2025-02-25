import java.util.Scanner;

public class SumOfNaturalNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input
    System.out.print("Enter a natural number: ");
    int n = scanner.nextInt();

    // Check if the input is a natural number
    if (n <= 0) {
      System.out.println("Please enter a natural number greater than 0.");
    } else {
      // Compute sum using formula
      int sumFormula = n * (n + 1) / 2;

      // Compute sum using while loop
      int sumLoop = 0;
      int i = 1;
      while (i <= n) {
        sumLoop += i;
        i++;
      }

      // Output
      System.out.println("Sum using formula: " + sumFormula);
      System.out.println("Sum using while loop: " + sumLoop);

      // Compare results
      if (sumFormula == sumLoop) {
        System.out.println("Both computations are correct.");
      } else {
        System.out.println("There is a discrepancy in the computations.");
      }
    }

    scanner.close();
  }
}
