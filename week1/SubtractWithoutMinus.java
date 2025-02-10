import java.util.Scanner;

public class SubtractWithoutMinus {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    int number1, number2, sum;
    number1 = input.nextInt();
    number2 = input.nextInt();

    sum = ~number1 + number2 + 1;
    System.out.println(-sum);

  }
}
