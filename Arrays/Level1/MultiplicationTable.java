import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    input.close();

    int multipicationResult[] = new int[4];
    for (int i = 0; i < 4; i++) {
      multipicationResult[i] = number * (6 + i);
      System.out.println(number + " * " + (6 + i) + " = " + multipicationResult[i]);
    }
  }
}
