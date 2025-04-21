import java.util.Scanner;

public class StudentReport {

  public static final String RESET = "\u001B[0m";
  public static final String BLUE = "\u001B[44m";
  public static final String GREEN = "\u001B[42m";
  public static final String YELLOW = "\u001B[43m";
  public static final String ORANGE = "\u001B[48;5;208m";
  public static final String RED = "\u001B[41m";
  public static final String BLACK = "\u001B[40m";
  public static final String WHITE_TEXT = "\u001B[37m";

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of students: ");
    int n = input.nextInt();

    int[][] marks = new int[n][3];
    double[][] results = new double[n][4];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 3; j++) {
        marks[i][j] = (int) (Math.random() * 100);
      }
    }

    for (int i = 0; i < n; i++) {
      int total = 0;
      for (int j = 0; j < 3; j++) {
        total += marks[i][j];
      }
      double avg = total / 3.0;
      double percentage = avg;
      int gradeIndex = getGradeIndex(percentage);

      results[i][0] = total;
      results[i][1] = Math.round(avg * 100.0) / 100.0;
      results[i][2] = Math.round(percentage * 100.0) / 100.0;
      results[i][3] = gradeIndex;
    }

    System.out.printf("%-5s %-8s %-8s %-8s %-10s %-10s %-10s %-7s %-40s\n",
        "S.No", "Physics", "Chemistry", "Math", "Total", "Average", "Percent", "Grade", "Remarks");

    for (int i = 0; i < n; i++) {
      int gradeIdx = (int) results[i][3];
      String grade = getGrade(gradeIdx);
      String bgColor = "";

      switch (grade) {
        case "A":
          bgColor = BLUE;
          break;
        case "B":
          bgColor = GREEN;
          break;
        case "C":
          bgColor = YELLOW;
          break;
        case "D":
          bgColor = ORANGE;
          break;
        case "E":
          bgColor = RED;
          break;
        case "R":
          bgColor = BLACK;
          break;
        default:
          bgColor = "";
          break;
      }

      System.out.print(bgColor);

      System.out.printf("%-5d", (i + 1));
      for (int j = 0; j < 3; j++) {
        System.out.printf("%-9d", marks[i][j]);
      }
      for (int j = 0; j < 3; j++) {
        System.out.printf("%-11.2f", results[i][j]);
      }

      System.out.printf("%-8s", grade);
      System.out.println(getRemark(gradeIdx));

      System.out.print(RESET);
    }

    input.close();
  }

  static int getGradeIndex(double percent) {
    if (percent >= 80)
      return 0;
    else if (percent >= 70)
      return 1;
    else if (percent >= 60)
      return 2;
    else if (percent >= 50)
      return 3;
    else if (percent >= 40)
      return 4;
    else
      return 5;
  }

  static String getGrade(int index) {
    String[] grades = { "A", "B", "C", "D", "E", "R" };
    return grades[index];
  }

  static String getRemark(int index) {
    String[] remarks = {
        "(Level 4, above agency-normalized standards)",
        "(Level 3, at agency-normalized standards)",
        "(Level 2, below but approaching standards)",
        "(Level 1, well below standards)",
        "(Level 1-, too below standards)",
        "(Remedial standards)"
    };
    return remarks[index];
  }
}
