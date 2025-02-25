import java.util.Scanner;

public class PrintFactors {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // taking user input
    System.out.print("Enter number: ");
    int number = input.nextInt();
    input.close();
    // factors and output
    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        System.out.println(i);
      }
    }
  }
}
