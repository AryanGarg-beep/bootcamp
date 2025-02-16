import java.util.Scanner;

public class QuotientRemainder {
  public static void main(String[] args) {
    // create scanner object
    Scanner input = new Scanner(System.in);

    // takeing user input
    System.out.print("Enter dividend: ");
    int dividend = input.nextInt();
    System.out.print("Enter divisor: ");
    int divisor = input.nextInt();
    input.close();

    // Calculations
    int quotient = dividend / divisor;
    int remainder = dividend % divisor;
    // printing the output
    System.out.println("The quotient is: " + quotient + " and the remainder is: " + remainder + " of the 2 numbers,"
        + dividend + " and " + divisor);
  }
}
