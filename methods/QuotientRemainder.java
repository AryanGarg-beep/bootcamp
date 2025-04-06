import java.util.Scanner;

public class QuotientRemainder {
  public static int[] findRemainderAndQuotient(int number, int divisor) {
    int quotient = number / divisor;
    int remainder = number % divisor;

    return new int[] { quotient, remainder };
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter dividend: ");
    int number = input.nextInt();
    System.out.print("ENter divisor: ");
    int divisor = input.nextInt();

    int[] result = findRemainderAndQuotient(number, divisor);
    System.out.println("Quotient: " + result[0] + "\nRemainder: " + result[1]);
    input.close();
  }
}
