import java.util.Scanner;

public class FactorialWithWhile {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // taking user input
    System.out.print("Enter a natural number: ");
    int n = input.nextInt();
    // Checking for natural number
    if (n <= 0) {
      System.out.println("Please enter a natural number greater than 0.");
    } else {
      int factorial = 1;
      int i = 1;
      // factorial calculation
      while (i <= n) {
        factorial *= i;
        i++;
      }

      System.out.println("Factorial using while loop: " + factorial);
      input.close();
    }
  }
}
