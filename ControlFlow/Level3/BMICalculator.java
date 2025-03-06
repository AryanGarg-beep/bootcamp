import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // taking user input
    System.out.print("Enter your weight in kg: ");
    double weight = input.nextDouble();
    System.out.print("Enter your height in meters: ");
    double height = input.nextDouble();
    input.close();

    // Caalculating BMI
    double BMI = weight / (height * height);

    // Checking condition and printing the result
    if (BMI <= 18.4) {
      System.out.println("Underweight");
    } else if (BMI >= 18.5 && BMI < 24.9) {
      System.out.println("Normal weight");
    } else if (BMI >= 25 && BMI < 29.9) {
      System.out.println("Overweight");
    } else {
      System.out.println("Obesity");
    }
  }
}
