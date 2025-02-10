import java.util.Scanner;

public class CalcSquareSide {
  public static void main(String[] args) {
    // input object creation
    Scanner input = new Scanner(System.in);

    // taking input from user
    System.out.print("Enter the perimeter of the square: ");
    double perimeter = input.nextDouble();

    // Calculations
    double side = perimeter / 4;

    // printing output
    System.out.println("The lenght of the side is " + side + " whose perimeter is " + perimeter);
    input.close();
  }
}
