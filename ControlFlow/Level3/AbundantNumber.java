import java.util.Scanner;

public class AbundantNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    input.close();

    int originalNumber = number;
    int sum = 0;

    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        sum += i;
      }
    }
    if (sum > originalNumber) {
      System.out.println("Abundant number");
    } else {
      System.out.println("Not an abundant number");
    }
  }
}
