
import java.util.Scanner;

public class IntOperation {
  public static void main(String[] args) {
    // creating object class Scanner
    Scanner input = new Scanner(System.in);
    // taking user input
    System.out.print("Enter value for a: ");
    int a = input.nextInt();
    System.out.print("Enter value for b: ");
    int b = input.nextInt();
    System.out.print("Enter value for c: ");
    int c = input.nextInt();

    input.close();
    // calculations
    int ans1 = a + b * c;
    int ans2 = a * b + c;
    int ans3 = c + a / b;
    int ans4 = a % b + c;

    // printing the results
    System.out.println("The results of the Int Operations are:" + ans1 + "," + ans2 + "," + ans3 + " and " + ans4);
  }
}
