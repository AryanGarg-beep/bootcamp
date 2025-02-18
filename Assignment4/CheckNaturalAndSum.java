import java.util.Scanner;

public class CheckNaturalAndSum {
  public static void main(String[] args) {
    // making input object
    Scanner input = new Scanner(System.in);
    // taking user input
    int n = input.nextInt();
    input.close();
    // checking for largest number and printing output
    if (n < 0) {
      System.out.println(n + " is not a natural number");
    } else {
      int sum = n * (n + 1) / 2;
      System.out.println("Sum of first " + n + " natural numbers is " + sum);
    }
  }
}
