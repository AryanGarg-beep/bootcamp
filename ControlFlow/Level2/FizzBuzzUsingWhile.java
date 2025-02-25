import java.util.Scanner;

public class FizzBuzzUsingWhile {
  public static void main(String[] args) {
    int i = 0;
    Scanner input = new Scanner(System.in);
    // taking user input
    System.out.print("Enter the number: ");
    int number = input.nextInt();
    input.close();
    // conditions and output
    while (i <= number) {
      if (i == 0) {
        System.out.println("0");// fixing zero case
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
      i++;
    }
  }
}
