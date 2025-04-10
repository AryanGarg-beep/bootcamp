import java.util.Scanner;

public class StudentAgeChecker {
  public static boolean canStudentVote(int age) {
    if (age >= 18)
      return true;
    return false;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] age = new int[10];
    for (int i = 0; i < 10; i++) {
      System.out.print("Enter age for student " + (i + 1) + ": ");
      age[i] = input.nextInt();
      if (canStudentVote(age[i])) {
        System.out.println("\u001B[42mStudent " + (i + 1) + " can vote\u001B[0m");
      } else
        System.out.println("\u001B[41mStudent " + (i + 1) + " cannot vote\u001B[0m");
    }
    input.close();
  }
}
