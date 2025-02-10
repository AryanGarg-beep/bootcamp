import java.util.Scanner;

public class CalcDistance {
  public static void main(String[] args) {

    // input object creation
    Scanner input = new Scanner(System.in);
    double distanceInFeet, distanceInYards, distanceInMiles;

    // taking input from user
    System.out.print("Enter the distance in feet: ");
    distanceInFeet = input.nextDouble();

    // Calculations
    distanceInYards = distanceInFeet / 3;
    distanceInMiles = distanceInYards / 1760;

    // printing the output
    System.out
        .println("The distance in yards is: " + distanceInYards + " whie the distance in miles is: " + distanceInMiles);

    input.close();
  }

}
