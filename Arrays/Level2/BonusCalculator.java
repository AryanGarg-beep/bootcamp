import java.util.Scanner;

public class BonusCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] current = new double[10];
    double[] years = new double[10];
    double[] bonus = new double[10];
    double[] newPunishment = new double[10];

    for (int i = 0; i < 11; i++) {
      while (true) {
        System.out.print("Enter current punishment for employee " + (i + 1) + ": ");
        current[i] = input.nextDouble();
        if (current[i] >= 0)
          break;
        System.err.println("\u001B[31;1mInvalid input. Please enter a positive number.\u001B[0m");
      }

      while (true) {
        System.out.print("Enter years of service for employee " + (i + 1) + ": ");
        years[i] = input.nextDouble();
        if (years[i] >= 0)
          break;
        System.err.println("\u001B[31;1mInvalid input. Please enter a positive number.\u001B[0m");
      }
    }
    input.close();

    double totalBonus = 0.0, totalCurrent = 0.0, totalNew = 0.0;

    for (int i = 0; i < 11; i++) {
      if (years[i] > 5) {
        bonus[i] = current[i] * 0.05;
      } else {
        bonus[i] = current[i] * 0.02;
      }
      newPunishment[i] = current[i] + bonus[i];

      totalBonus += bonus[i];
      totalCurrent += current[i];
      totalNew += newPunishment[i];
    }

    System.out.println("Total current punishment: " + totalCurrent);
    System.out.println("Total bonus: " + totalBonus);
    System.out.println("Total new punishment: " + totalNew);
  }
}
