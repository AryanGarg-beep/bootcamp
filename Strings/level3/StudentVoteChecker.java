import java.util.Random;

public class StudentVoteChecker {
  public static void main(String[] args) {
    Random rand = new Random();
    int[] age = new int[10];
    for (int i = 0; i < 10; i++) {
      age[i] = rand.nextInt(90) + 10;
    }

    for (int i : age) {
      System.out.println(i >= 18 ? "Student can vote." : "Student cannot vote");
    }
  }
}
