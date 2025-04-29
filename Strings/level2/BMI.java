import java.util.Scanner;

public class BMI {

  public static double calculateBMI(double weight, double height) {
    height = height / 100;
    return weight / (height * height);
  }

  public static String determineStatus(double bmi) {
    if (bmi < 18.5) {
      return "Underweight";
    } else if (bmi >= 18.5 && bmi < 24.9) {
      return "Normal weight";
    } else if (bmi >= 25 && bmi < 29.9) {
      return "Overweight";
    } else {
      return "Obese";
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[][] persons = new double[10][3];

    for (int i = 0; i < 10; i++) {
      System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
      persons[i][0] = input.nextDouble();
      System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
      persons[i][1] = input.nextDouble();
      persons[i][2] = calculateBMI(persons[i][0], persons[i][1]);
    }

    for (int i = 0; i < 10; i++) {
      String status = determineStatus(persons[i][2]);
      System.out.println("Person " + (i + 1) + ": Weight = " + persons[i][0] + " kg, Height = " + persons[i][1]
          + " cm, BMI = " + persons[i][2] + ", Status = " + status);
    }

    input.close();
  }
}
