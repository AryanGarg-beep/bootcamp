import java.util.Scanner;

public class Trignometry {
  public double[] calculateTrignometricFunctions(double angle) {
    return new double[] { Math.sin(angle), Math.cos(angle), Math.tan(angle) };
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter angle in degrees: ");
    double degrees = input.nextDouble();
    double radians = Math.toRadians(degrees);

    Trignometry obj = new Trignometry();
    double[] result = obj.calculateTrignometricFunctions(radians);

    System.out.println("Sin(" + degrees + ") = " + result[0]);
    System.out.println("cos(" + degrees + ") = " + result[1]);
    System.out.println("tan(" + degrees + ") = " + result[2]);

    input.close();
  }
}
