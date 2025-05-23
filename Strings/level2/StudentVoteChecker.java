import java.util.Scanner;

public class StudentVoteChecker {

  public static boolean canStudentVote(int age) {
    if (age < 0) {
      return false; // Invalid age
    }
    return age >= 18; // Vote if age is 18 or more
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] studentAges = new int[10];

    for (int i = 0; i < 10; i++) {
      System.out.print("Enter the age of student " + (i + 1) + ": ");
      studentAges[i] = input.nextInt();
    }

    for (int i = 0; i < 10; i++) {
      boolean canVote = canStudentVote(studentAges[i]);
      if (canVote) {
        System.out.println("Student " + (i + 1) + " can vote.");
      } else {
        System.out.println("Student " + (i + 1) + " cannot vote.");
      }
    }

    input.close();
  }
}
