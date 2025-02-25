
import java.util.Scanner;

public class DoubleOpt {
  public static void main(String[] args) {
    // creating object class Scanner
    Scanner input = new Scanner(System.in);
    // taking user input
    System.out.print("Enter value for a: ");
    double a = input.nextDouble();
    System.out.print("Enter value for b: ");
    int b = input.nextInt();
    System.out.print("Enter value for c: ");
    int c = input.nextInt();

    input.close();
    // calculations
    double ans1 = a + b * c;
    double ans2 = a * b + c;
    double ans3 = c + a / b;
    double ans4 = a % b + c;
    // printing the results
    System.out
        .println("The results of the Double Operations are: " + ans1 + ", " + ans2 + ", " + ans3 + " and " + ans4);
  }
}
