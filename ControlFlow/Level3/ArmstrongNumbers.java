import java.util.Scanner;

public class ArmstrongNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // taking user input
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    input.close();

    int sum = 0;
    int originalNumber = number;
    int digit;

    // logic to check if the number is Armstrong or not
    while (number > 0) {
      digit = number % 10;
      sum += digit * digit * digit;
      number /= 10;
    }

    // printing the result
    if (sum == originalNumber) {
      System.out.println("Armstrong number");
    } else {
      System.out.println("Not an Armstrong number");
    }
  }
}
