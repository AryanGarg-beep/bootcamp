import java.util.Scanner;

public class PrintMultiplesTill100 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // taking user input
    System.out.print("Enter number: ");
    int number = input.nextInt();
    input.close();

    // finding and printing multiples
    for (int i = 100; i >= 1; i--) {
      if (i % number == 0) {
        System.out.println(i);
      }
    }
  }
}
