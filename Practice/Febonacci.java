import java.util.Scanner;

public class Febonacci {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = 0, b = 1, c = 0;
    System.out.print("Enter the number of terms: ");
    int limit = input.nextInt();
    input.close();

    for (int i = 0; i < limit; i++) {
      System.out.println(c);
      c = a + b;
      b = a;
      a = c;
    }

  }
}
