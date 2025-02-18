import java.util.Scanner;

public class SmallestOf3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a, b, c;
    // taking input from user
    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();
    input.close();
    // checking for smallest number
    if (a < b && a < c) {
      System.out.println(a + " is the smallest number");
    } else
      System.out.println(a + " is not the smallest number");
  }
}
