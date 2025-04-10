import java.util.Scanner;
import java.util.Random;

public class SumOfNaturalNumbers {

  // Classic formula method
  public static int sum(int n) {
    return n * (n + 1) / 2;
  }

  // Sassy error messages
  public static String getSassyMessage() {
    String[] messages = {
        "\u001B[31;1mThat's not even a natural number! Try again.\u001B[0m",
        "\u001B[31;1mSeriously? Natural numbers are like... 1 and above.\u001B[0m",
        "\u001B[31;1mWere you even trying? Give me something valid!\u001B[0m",
        "\u001B[31;1mYou're trolling now, aren't you?\u001B[0m",
        "\u001B[31;1mNegative? In *this* economy? Nope.\u001B[0m"
    };
    Random rand = new Random();
    return messages[rand.nextInt(messages.length)];
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number = 0;

    while (true) {
      System.out.print("Enter a natural number: ");
      number = input.nextInt();
      if (number > 0)
        break;
      System.out.println(getSassyMessage());
    }

    System.out.println("\nThe sum of first " + number + " natural numbers is: " + sum(number));
    input.close();
  }
}
