import java.util.Scanner;

public class FizzBuzzUsingFor {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int number = input.nextInt();
	input.close();
    for (int i = 0; i <= number; i++) {
      if (i % 5==0) {
        System.out.println("Buzz");
      } else if (i % 3==0) {
        System.out.println("Fizz");
      } else {
        System.out.println(i);
      }
    }
  }
}
