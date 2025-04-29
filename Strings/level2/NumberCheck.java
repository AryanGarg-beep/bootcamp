import java.util.Scanner;

public class NumberCheck {

  public static String isPositive(int num) {
    return (num >= 0) ? "Positive" : "Negative";
  }

  public static String isEven(int num) {
    return (num % 2 == 0) ? "Even" : "Odd";
  }

  public static int compare(int num1, int num2) {
    if (num1 > num2)
      return 1;
    if (num1 == num2)
      return 0;
    return -1;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] numbers = new int[5];

    // Taking input for 5 numbers
    for (int i = 0; i < 5; i++) {
      System.out.print("Enter number " + (i + 1) + ": ");
      numbers[i] = input.nextInt();
    }

    // Checking positive/negative and even/odd
    for (int i = 0; i < 5; i++) {
      String positivity = isPositive(numbers[i]);
      String evenOdd = isEven(numbers[i]);
      System.out.println("Number " + numbers[i] + " is " + positivity + " and " + evenOdd + ".");
    }

    // Comparing first and last elements
    int comparisonResult = compare(numbers[0], numbers[4]);
    if (comparisonResult == 1) {
      System.out.println("First number is greater than the last number.");
    } else if (comparisonResult == 0) {
      System.out.println("First number is equal to the last number.");
    } else {
      System.out.println("First number is less than the last number.");
    }

    input.close();
  }
}
