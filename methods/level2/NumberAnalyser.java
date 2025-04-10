import java.util.Scanner;

public class NumberAnalyser {
  public static boolean isPositive(int num) {
    return num >= 0;
  }

  public static boolean isEven(int num) {
    return num % 2 == 0;
  }

  public static int compare(int num1, int num2) {
    if (num1 > num2)
      return 1;
    else if (num1 < num2)
      return -1;
    else
      return 0;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] numbers = new int[5];

    for (int i = 0; i < 5; i++) {
      System.out.print("Enter number " + (i + 1) + ": ");
      numbers[i] = input.nextInt();
    }

    System.out.println("\nNumber Analysis:");

    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Number " + numbers[i] + " is ");

      if (isPositive(numbers[i])) {
        System.out.print("positive and ");
        if (isEven(numbers[i]))
          System.out.println("even");
        else
          System.out.println("odd");
      } else {
        System.out.println("negative");
      }
    }

    System.out.println("\nComparing first and last elements:");
    int comparison = compare(numbers[0], numbers[numbers.length - 1]);

    if (comparison == 1)
      System.out.println(numbers[0] + " is greater than " + numbers[numbers.length - 1]);
    else if (comparison == -1)
      System.out.println(numbers[0] + " is less than " + numbers[numbers.length - 1]);
    else
      System.out.println(numbers[0] + " is equal to " + numbers[numbers.length - 1]);

    input.close();
  }
}
