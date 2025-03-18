import java.util.Scanner;

public class MeanHeight {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double height[] = new double[11];
    for (int i = 0; i < 11; i++) {
      System.out.print("Enter height for player " + i + 1 + ": ");
      height[i] = input.nextDouble();
    }
    input.close();
    double sum = 0.0;
    for (double i : height) {
      sum += i;
    }
    double mean = sum / 11;

    System.out.println("Mean height: " + mean);
  }
}
