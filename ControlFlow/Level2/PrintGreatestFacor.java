import java.util.Scanner;

public class PrintGreatestFacor {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // taking user input
    System.out.print("Enter number: ");
    int number = input.nextInt();
    input.close();

    // greatest factor calculation
    int greatestFactor = 1;
    for (int i = number - 1; i >= 1; i--) {
      if (number % i == 0) {
        greatestFactor = i;
        break;
      }
    }

    // output the greatest factor
    System.out.println("Greatest factor (besides itself): " + greatestFactor);
  }
}
