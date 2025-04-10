import java.util.Scanner;

public class TeamBMI {
  public static void calculateBMI(double[][] data) {
    for (int i = 0; i < data.length; i++) {
      double heightInMeters = data[i][1] / 100;
      data[i][2] = data[i][0] / (heightInMeters * heightInMeters);
    }
  }

  public static String[] determineStatus(double[][] data) {
    String[] status = new String[10];
    for (int i = 0; i < data.length; i++) {
      double bmi = data[i][2];
      if (bmi < 18.5)
        status[i] = "Underweight";
      else if (bmi < 25)
        status[i] = "Normal";
      else if (bmi < 30)
        status[i] = "Overweight";
      else
        status[i] = "Obese";
    }
    return status;
  }

  public static String getColorCode(String status) {
    if (status.equals("Underweight"))
      return "\u001B[43m";
    if (status.equals("Normal"))
      return "\u001B[42m";
    if (status.equals("Overweight"))
      return "\u001B[48;5;208m";
    if (status.equals("Obese"))
      return "\u001B[41m";
    return "";
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[][] memberData = new double[10][3];
    String[] names = new String[10];

    for (int i = 0; i < 10; i++) {
      System.out.print("Enter name for member " + (i + 1) + ": ");
      names[i] = input.nextLine();

      System.out.print("Enter weight (kg) for " + names[i] + ": ");
      memberData[i][0] = input.nextDouble();

      System.out.print("Enter height (cm) for " + names[i] + ": ");
      memberData[i][1] = input.nextDouble();
      input.nextLine();
    }

    calculateBMI(memberData);
    String[] status = determineStatus(memberData);

    System.out.println("\nTeam BMI Report:");
    System.out.println("Name\t\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
    for (int i = 0; i < 10; i++) {
      String colorCode = getColorCode(status[i]);
      System.out.print(colorCode);
      System.out.printf("%s\t\t%.1f\t\t%.1f\t\t%.2f\t\t%s",
          names[i], memberData[i][0], memberData[i][1], memberData[i][2], status[i]);
      System.out.println("\u001B[0m");
    }

    input.close();
  }
}
