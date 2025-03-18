import java.util.Scanner;

public class FizzBuzz {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    input.close();

    if (number < 0) {
      System.err.println("Please enter a positive number");
      System.exit(1);
    }

    String array[] = new String[number + 1];

    // Fill the array with FizzBuzz logic
    for (int i = 1; i <= number; i++) {
      if (i % 15 == 0) {
        array[i] = "FizzBuzz";
      } else if (i % 3 == 0) {
        array[i] = "Fizz";
      } else if (i % 5 == 0) {
        array[i] = "Buzz";
      } else {
        array[i] = Integer.toString(i);
      }
    }

    // Print the array
    for (int i = 1; i <= number; i++) {
      System.out.println(array[i]);
    }
  }
}
