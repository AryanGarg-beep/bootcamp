import java.util.Scanner;

public class ThreeFriends {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] age = new int[3];
    int[] height = new int[3];

    for (int i = 0; i < 3; i++) {
      while (true) {
        System.out.println("Enter age and height for friend " + (i + 1) + ": ");
        age[i] = input.nextInt();
        height[i] = input.nextInt();
        if (age[i] >= 0 && height[i] >= 0)
          break;
        System.err.println("\u001B[31;1mInvalid input.\u001B[0m");
      }
    }
    input.close();
    int temp = age[0];
    for (int i = 0; i < 3; i++) {
      if (age[i] < temp) {
        temp = age[i];
      }
    }
    System.out.println("Youngest friend is " + temp);
    temp = height[0];
    for (int i = 0; i < 3; i++) {
      if (height[i] > temp) {
        temp = height[i];
      }
    }
    System.out.println("Tallest friend is " + temp);
  }
}
