import java.util.Scanner;

public class PrintMultiplesUsingWhile{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // taking user input
    System.out.print("Enter number: ");
    int number = input.nextInt();
    input.close();

    // check if the number is a positive integer and less than 100
    if (number <= 0 || number >= 100) {
      System.out.println("Please enter a positive integer less than 100.");
      return;
    }

    // finding and printing multiples
    int counter = 100;
    while (counter > 1) {
      if (counter % number == 0) {
        System.out.println(counter);
      }
      counter--;
    }
  }
}
