import java.util.Scanner;

public class ReportCard {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    int[] physics = new int[number];
    int[] chemistry = new int[number];
    int[] maths = new int[number];

    for (int i = 0; i <= number; i++) {
      while (true) {
        System.out.println("Enter physics, chemistry and maths");
        physics[i] = input.nextInt();
        if (physics[i] > 0)
          break;
        System.out.println("\u001B[31;1mInvalid\u001B[0m");
      }

      while (true) {
        System.out.println("Enter chemistry marks");
        chemistry[i] = input.nextInt();
        if (chemistry[i] > 0)
          break;
        System.out.println("\u001B[31;1mInvalid\u001B[0m");
      }

      while (true) {
        System.out.println("Enter maths marks");
        maths[i] = input.nextInt();
        if (maths[i] > 0)
          break;
        System.out.println("\u001B[31;1mInvalid\u001B[0m");
      }
    }
    double[] percent = new double[number];
    for (int i = 0; i <= number; i++) {
      percent[i] = (physics[i] + chemistry[i] + maths[i]) / 3;
      if (percent[i] >= 80) {
        System.out.println("level 4 for student " + i + 1);
      } else if (percent[i] >= 70 && percent[i] <= 79) {
        System.out.println("Level 3 for student" + i + 1);
      } else if (percent[i] >= 60 && percent[i] <= 69) {
        System.out.println("Level 2 for student" + i + 1);
      } else if (percent[i] >= 50 && percent[i] <= 59) {
        System.out.println("Level 1 for student" + i + 1);
      } else if (percent[i] >= 40 && percent[i] <= 49) {
        System.out.println("Level 1- for student" + i + 1);
      } else {
        System.out.println("Remedial standards for student " + i + 1);
      }
    }
    input.close();
  }
}
