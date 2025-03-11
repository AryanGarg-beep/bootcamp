import java.util.Scanner;

public class EmpirpNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number: ");
    int num = input.nextInt();
    input.close();

    int checks = 1; // Assume prime
    for (int i = 2; i * i <= num; i++) { // Efficient prime check
      if (num % i == 0) {
        checks = 0; // Not prime
        break;
      }
    }

    if (checks == 1) { // If number is prime, check its reverse
      int originalNum = num; // Store original number
      int reverse = 0, digit;

      while (num > 0) { // Reverse the number
        digit = num % 10;
        reverse = reverse * 10 + digit;
        num = num / 10;
      }

      if (reverse == originalNum) { // Check if palindrome (emirp can't be palindrome)
        System.out.println(reverse);
        System.out.println("It is not an emirp number");
        return;
      }

      checks = 1; // Assume reverse is prime
      for (int j = 2; j * j <= reverse; j++) { // Prime check for reversed number
        if (reverse % j == 0) {
          checks = 0;
          break;
        }
      }

      System.out.println(reverse);
      if (checks == 1) {
        System.out.println("It is an emirp number");
      } else {
        System.out.println("It is not an emirp number");
      }
    } else {
      System.out.println("It is not an emirp number");
    }
  }
}
