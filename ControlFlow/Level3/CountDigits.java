import java.util.Scanner;

public class CountDigits {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // taking user input
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    input.close();

    // logic loop
    int count = 0;
    while (number != 0) {
      number /= 10;
      count++;
    }
    // printing the result
    System.out.println("Number of digits: " + count);
  }
}
