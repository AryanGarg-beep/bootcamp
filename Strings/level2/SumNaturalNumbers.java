import java.util.Scanner;

public class SumNaturalNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a natural number: ");
    int n = input.nextInt();
    if (n <= 0) {
      System.out.println("Not a natural number.");
      return;
    }
    int sumRecursive = sumRecursive(n);
    int sumFormula = sumFormula(n);
    System.out.println("Sum using recursion: " + sumRecursive);
    System.out.println("Sum using formula: " + sumFormula);
  }

  public static int sumRecursive(int n) {
    if (n == 1)
      return 1;
    return n + sumRecursive(n - 1);
  }

  public static int sumFormula(int n) {
    return n * (n + 1) / 2;
  }
}
