import java.util.Scanner;

public class MultiplyWithoutAsterisk {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double num1 = input.nextDouble();
    double num2 = input.nextDouble();
    double num3 = num1 / (1 / num2);
    System.out.println(num3);
    input.close();
  }
}
