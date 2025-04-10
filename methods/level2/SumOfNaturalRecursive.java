import java.util.Scanner;

public class SumOfNaturalRecursive {
  public static int sum(int n) {
    return (n * (n + 1)) / 2;
  }

  public static int recursion(int n) {
    if (n == 1)
      return 1;
    return n + recursion(n - 1);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n;
    while (true) {
      System.out.print("Enter a number: ");
      n = input.nextInt();
      if (n > 0)
        break;
      System.out.println("\u001B[31;1mNot a valid input\u001B[0m");
    }
    System.out.println("Sum via formula is: " + sum(n));
    System.out.println("Sum via recursion is: " + recursion(n));
    input.close();
  }

}
