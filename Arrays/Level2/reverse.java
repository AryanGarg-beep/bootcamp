import java.util.Scanner;

public class reverse {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    input.close();
    int originaNumer = number;
    int count = 0;

    while (number > 0) {
      number = number / 10;
      count++;
    }

    int[] digits = new int[count];
    for (int i = 0; i < count; i++) {
      digits[i] = originaNumer % 10;
      originaNumer = originaNumer / 10;
      System.out.print(digits[i]);
    }

  }
}
