import java.util.Scanner;

public class LargestOf3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a, b, c;
    // taking input from user
    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();
    input.close();
    // checking for largest number
    if (a > b && a > c) {
      System.out.println(a + " is the largest number");
    } else if (b > a && b > c) {
      System.out.println(b + " is the largest number");
    } else {
      System.out.println(c + " is the largest number");
    }
  }
}
