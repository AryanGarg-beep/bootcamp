import java.util.Scanner;

public class BMI {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of people: ");
    int number = input.nextInt();

    double[] weight = new double[number];
    double[] height = new double[number];
    double[] bmi = new double[number];
    String[] status = new String[number];

    for (int i = 0; i < number; i++) {
      while (true) {
        System.out.println("Enter height(m) and weight(kg) of person " + (i + 1) + ": ");
        height[i] = input.nextDouble();
        weight[i] = input.nextDouble();

        if (height[i] > 0 && weight[i] > 0) {
          break;
        }
        System.err.println("\u001B[31;1mPlease enter valid values\u001B[0m");
      }
    }
    input.close();

    for (int i = 0; i < number; i++) {
      if (height[i] > 0) { // Avoid division by zero
        bmi[i] = weight[i] / (height[i] * height[i]);
      } else {
        bmi[i] = 0;
      }

      if (bmi[i] <= 18.4) {
        status[i] = "Underweight";
      } else if (bmi[i] <= 24.9) {
        status[i] = "Normal";
      } else if (bmi[i] <= 39.9) {
        status[i] = "Overweight";
      } else {
        status[i] = "Obese";
      }

      System.out.println("\nPerson " + (i + 1) + ":");
      System.out.printf("Height: %.2f m\n", height[i]);
      System.out.printf("Weight: %.2f kg\n", weight[i]);
      System.out.printf("BMI: %.2f\n", bmi[i]);
      System.out.println("Weight Status: " + status[i]);
    }
  }
}
