import java.util.Scanner;

public class PrintGreatestFactorWithWhile {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // taking user input
    System.out.print("Enter number: ");
    int number = input.nextInt();
    input.close();

    // greatest factor calculation
    int greatestFactor = 1;
    int counter = number - 1;

    while (counter >= 1) {
      if (number % counter == 0) {
        greatestFactor = counter;
        break;
      }
      counter--;
    }

    // output the greatest factor
    System.out.println("Greatest factor (besides itself): " + greatestFactor);
  }
}
