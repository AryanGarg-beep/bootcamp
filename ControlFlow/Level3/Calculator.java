import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    double first = input.nextDouble();
    System.out.print("Enter second number: ");
    double second = input.nextDouble();
    System.out.print("Enter an operator (+, -, *, /): ");
    String op = input.next();
    input.close();

    switch (op) {
      case "+":
        System.out.println("Result: " + (first + second));
        break;
      case "-":
        System.out.println("Result: " + (first - second));
        break;
      case "*":
        System.out.println("Result: " + (first * second));
        break;
      case "/":
        System.out.println("Result: " + (first / second));
        break;
      default:
        System.out.println("Invalid operator");
    }
  }
}
