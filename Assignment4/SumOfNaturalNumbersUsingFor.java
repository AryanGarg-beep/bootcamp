import java.util.Scanner;

public class SumOfNaturalNumbersUsingFor {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a natural number: ");
    int n = input.nextInt();

    if (n <= 0) {
      System.out.println("Please enter a natural number greater than 0.");
    } else {
      int sumFormula = n * (n + 1) / 2;
      int sumLoop = 0;

      for (int i = 1; i <= n; i++) {
        sumLoop += i;
      }

      System.out.println("Sum using formula: " + sumFormula);
      System.out.println("Sum using for loop: " + sumLoop);

      if (sumFormula == sumLoop) {
        System.out.println("Both computations are correct.");
      } else {
        System.out.println("There is a discrepancy in the computations.");
      }
    }
    input.close();
  }
}
