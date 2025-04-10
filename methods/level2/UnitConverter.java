import java.util.Scanner;

public class UnitConverter {
  public static double kmToMiles(double kilometers) {
    return kilometers * 0.621371;
  }

  public static double milesToKilometers(double miles) {
    return miles * 1.60934;
  }

  public static double metersToFeet(double meters) {
    return meters * 3.28084;
  }

  public static double feetToMeters(double feet) {
    return feet * 0.3048;
  }

  public static double yardsToFeet(double yards) {
    return yards * 3;
  }

  public static double feetToYards(double feet) {
    return feet * 0.333333;
  }

  public static double metersToInches(double meters) {
    return meters * 39.3701;
  }

  public static double inchesToMeters(double inches) {
    return inches * 0.0254;
  }

  public static double inchesToCentimeters(double inches) {
    return inches * 2.54;
  }

  public static double convertFarhenheitToCelsius(double farhenheit) {
    return (farhenheit - 32) * 5 / 9;
  }

  public static double convertCelsiusToFarhenheit(double celsius) {
    return (celsius * 9 / 5) + 32;
  }

  public static double convertPoundsToKilograms(double pounds) {
    return pounds * 0.453592;
  }

  public static double convertKilogramsToPounds(double kilograms) {
    return kilograms * 2.20462;
  }

  public static double convertGallonsToLiters(double gallons) {
    return gallons * 3.78541;
  }

  public static double convertLitersToGallons(double liters) {
    return liters * 0.264172;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double distance;
    while (true) {
      System.out.print("Enter distance: ");
      distance = input.nextDouble();
      if (distance >= 0)
        break;
      System.out.println("\u001B[31;1mInvalid Input\u001B[0m");
    }
    System.out.println("\nkmToMiles: " + kmToMiles(distance));
    System.out.println("milesToKilometers: " + milesToKilometers(distance));
    System.out.println("metersToFeet: " + metersToFeet(distance));
    System.out.println("feetToMeters: " + feetToMeters(distance));
    System.out.println("yardsToFeet: " + yardsToFeet(distance));
    System.out.println("feetToYards: " + feetToYards(distance));
    System.out.println("metersToInches: " + metersToInches(distance));
    System.out.println("inchesToMeters: " + inchesToMeters(distance));
    System.out.println("inchesToCentimeters: " + inchesToCentimeters(distance));
    input.close();
  }
}
