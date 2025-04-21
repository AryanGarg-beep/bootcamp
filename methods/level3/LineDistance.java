import java.util.Scanner;

public class LineDistance {

  public static double calculateDistance(double x1, double y1, double x2, double y2) {
    return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
  }

  public static double[] getLineEquation(double x1, double y1, double x2, double y2) {
    double m = (y2 - y1) / (x2 - x1);
    double b = y1 - m * x1;
    return new double[] { m, b };
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter x1: ");
    double x1 = input.nextDouble();
    System.out.print("Enter y1: ");
    double y1 = input.nextDouble();
    System.out.print("Enter x2: ");
    double x2 = input.nextDouble();
    System.out.print("Enter y2: ");
    double y2 = input.nextDouble();

    double distance = calculateDistance(x1, y1, x2, y2);
    System.out.printf("Euclidean Distance: %.2f\n", distance);

    if (x1 == x2) {
      System.out.println("The line is vertical. Equation: x = " + x1);
    } else {
      double[] line = getLineEquation(x1, y1, x2, y2);
      System.out.printf("Equation of line: y = %.2fx + (%.2f)\n", line[0], line[1]);
    }

    input.close();
  }
}
