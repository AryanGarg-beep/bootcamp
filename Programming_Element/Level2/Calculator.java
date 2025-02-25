import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {

    double number1, number2;
    Scanner input = new Scanner(System.in);

    // taking inputs
    System.out.println("Enter 2 numbers:");
    number1 = input.nextDouble();
    number2 = input.nextDouble();

    // doing the maths
    double sum = number1 + number2;
    double difference = number1 - number2;
    double product = number1 * number2;
    double quotient = number1 / number2;

    // outputs
    System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and "
        + number2 + " is " + sum + "," + difference + "," + product + "," + quotient);

  }
}
