import java.util.Scanner;

public class FactorialWithFor {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // taking user input
    System.out.print("Enter a natural number: ");
    int n = input.nextInt();
    // checking for natural number
    if (n <= 0) {
      System.out.println("Please enter a natural number greater than 0.");
    } else {
      int factorial = 1;
      // factorial calculation with for loop
      for (int i = 1; i <= n; i++) {
        factorial *= i;
      }
      // output printing
      System.out.println("Factorial using for loop: " + factorial);
      input.close();
    }
  }
}
