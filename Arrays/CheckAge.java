import java.util.Scanner;

public class CheckAge {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int age[] = new int[10];

    for (int i = 0; i < 10; i++) {
      System.out.print("Enter age: ");
      age[i] = input.nextInt();
    }
    for (int i = 0; i < 10; i++) {
      if (age[i] < 0) {
        System.err.println("\u001B[31;1mEnter a valid age.\u001B[0m");
      } else if (age[i] >= 18) {
        System.out.println("\u001B[32;1mStudent " + i + " can vote.\u001B[0m");
      } else {
        System.out.println("\u001B[33;1mStudent cannot vote.\u001B[0m");
      }
    }
    input.close();
  }
}
