import java.util.Scanner;

public class CheckIsPrime {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    input.close();

    boolean isPrime = true;

    if (number < 2) {
      System.out.println("Not a prime number");
    } else {
      for (int i = 2; i <= number / 2; i++) {
        if (number % i == 0) {
          isPrime = false;
        }
      }
      if (isPrime) {
        System.out.println("Prime number");
      } else {
        System.out.println("Not a prime number");
      }
    }
  }
}
