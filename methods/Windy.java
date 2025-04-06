import java.util.Scanner;

public class Windy {
  public static double calculateWindChill(double temperature, double windSpeed) {
    // I am using Math function to calculate the exponent because we cant do it
    // without taking the antilog of the power and then implementing taylor series
    // on the results.
    // Directly taking Math.pow() is much simpler and faster.
    return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter temperature: ");
    double temperature = input.nextDouble();
    System.out.print("Enter windSpeed: ");
    double windSpeed = input.nextDouble();

    System.out.println("Wind Chill: " + calculateWindChill(temperature, windSpeed));
    input.close();
  }
}
