import java.util.Scanner;

public class CalcTriangeArea {
  public static void main(String[] args) {
    // input object creation
    Scanner input = new Scanner(System.in);

    // taking input from user
    System.out.print("Enter the base of the triangle(in centimeters): ");
    double base = input.nextDouble();
    System.out.print("Enter the height of the triangle(in centimeters): ");
    double height = input.nextDouble();

    // Calculations
    double areaCentimeters = 0.5 * base * height;
    double areaInches = areaCentimeters / (2.54 * 2.54);

    // printing output
    System.out.println("The area of the triangle in sq.inch is: " + areaInches + " and sq.cm is: " + areaCentimeters);

    input.close();
  }
}
