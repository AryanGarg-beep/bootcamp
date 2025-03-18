import java.util.Scanner;

public class Factorization {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    input.close();

    int maxFactor = 10;
    int[] factors = new int[maxFactor];
    int index = 0;

    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        if (index == maxFactor) {
          // Double the array size
          maxFactor *= 2;
          int[] temp = new int[maxFactor];
          for (int j = 0; j < factors.length; j++) {
            temp[j] = factors[j];
          }
          factors = temp;
        }
        factors[index++] = i;
      }
    }

    // Display the factors
    System.out.println("Factors of " + number + ":");
    for (int i = 0; i < index; i++) {
      System.out.print(factors[i] + " ");
    }
  }
}
