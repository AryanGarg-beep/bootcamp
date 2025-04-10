import java.util.Scanner;

public class NumberOfRounds {
  public static double perimeter(double sides[]) {
    return sides[0] + sides[1] + sides[2];
  }

  public static double rounds(double perimeter) {
    return perimeter / 5;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] sides = new double[3];
    System.out.println("Enter the lenght of sides of the trangle--");
    for (int i = 0; i < 3; i++) {
      while (true) {
        System.out.print("Side " + (i + 1) + " : ");
        sides[i] = input.nextDouble();
        if (sides[i] > 0)
          break;
        System.out.println("\u001B[31;1mNot a valid input\u001B[0m");
      }
    }
    double perimeter = NumberOfRounds.perimeter(sides);
    double rounds = NumberOfRounds.rounds(perimeter);
    System.out.println("The number of rounds are: " + rounds);
    input.close();
  }
}
