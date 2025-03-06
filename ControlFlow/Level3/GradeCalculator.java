import java.util.Scanner;

public class GradeCalculator {
  public static void main(String[] args) {
    // taking user input
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Maths marks: ");
    double markMaths = input.nextDouble();
    System.out.print("Enter Physics marks: ");
    double markPhysics = input.nextDouble();
    System.out.print("Enter Chemistry marks: ");
    double markChemistry = input.nextDouble();
    input.close();
    // average calculation
    double average = (markMaths + markPhysics + markChemistry) / 3;
    System.out.println("Average: " + average);

    // checking condition and printing the result
    if (average >= 80) {
      System.out.println("Level 4, above agency-normalized standards");
    } else if (average >= 70) {
      System.out.println("Level 3, agency-normalized standards");
    } else if (average >= 60) {
      System.out.println("Level 2, below agency-normalized standards");
    } else if (average >= 50) {
      System.out.println("Level 1, well below agency-normalized standards");
    } else if (average >= 40) {
      System.out.println("Level 1-, too below agency-normalized standards");
    } else {
      System.out.println("remedial standards");
    }

  }
}
