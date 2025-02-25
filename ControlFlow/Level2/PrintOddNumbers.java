import java.util.Scanner;

public class PrintOddNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = scanner.nextInt();
    scanner.close();
    if (n <= 0) {
      System.out.println("Numer is not a natural number");
    }
    for (int i = 1; i <= n; i += 1) {
      System.out.println(i);
      if (i % 2 == 0) {
        System.out.println("Number is even");
      } else {
        System.out.println("Number is odd");
      }
    }
  }
}
