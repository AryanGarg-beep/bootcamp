import java.util.Scanner;

public class HarshadNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // taking user input
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    input.close();

    // initialize necessary variables
    int originalNumber = number;
    int sum = 0;
    int digit;

    // getting sum of digits
    while (number > 0) {
      digit = number % 10;
      sum += digit;
      number /= 10;
    }

    // printing the results
    if (originalNumber % sum == 0) {
      System.out.println("Harshad number");
    } else {
      System.out.println("Not a Harshad number");
    }
  }
}
