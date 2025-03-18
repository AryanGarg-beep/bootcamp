import java.util.Scanner;

public class MultiplicationTableTo10 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    input.close();

    int MultiplicationTable[] = new int[10];

    for (int i = 0; i < 10; i++) {
      MultiplicationTable[i] = number * (i + 1);
      System.out.println(number + " * " + (i + 1) + " = " + MultiplicationTable[i]);
    }
  }
}
