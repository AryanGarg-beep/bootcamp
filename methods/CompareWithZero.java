import java.util.Scanner;

public class CompareWithZero {
  public static int compare(int n) {
    if (n > 0) {
      return 1;
    } else if (n == 0) {
      return 0;
    } else {
      return -1;
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    System.out.println(compare(number));
    input.close();
  }
}
