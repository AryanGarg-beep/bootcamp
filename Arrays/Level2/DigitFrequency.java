import java.util.Scanner;

public class DigitFrequency {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    int[] count = new int[10];
    while (number > 0) {
      int digit = number % 10;
      count[digit]++;
      number = number / 10;
    }

    for (int i = 0; i < 10; i++) {
      if (count[i] > 0) {
        System.out.println("digit " + i + " is present " + count[i] + " times");
      }
    }
    input.close();
  }
}
