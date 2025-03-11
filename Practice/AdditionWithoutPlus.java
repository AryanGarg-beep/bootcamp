import java.util.Scanner;

public class AdditionWithoutPlus {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    double number1, number2;
    number1 = input.nextDouble();
    number2 = input.nextDouble();
    input.close();

    double sum = number1 - (-number2);
    System.out.println(sum);
  }
}
