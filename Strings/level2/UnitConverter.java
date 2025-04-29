import java.util.Scanner;

public class UnitConverter {

  public static double convertKmToMiles(double km) {
    return km * 0.621371;
  }

  public static double convertMilesToKm(double miles) {
    return miles * 1.60934;
  }

  public static double convertMetersToFeet(double meters) {
    return meters * 3.28084;
  }

  public static double convertFeetToMeters(double feet) {
    return feet * 0.3048;
  }

  public static double convertYardsToFeet(double yards) {
    return yards * 3;
  }

  public static double convertFeetToYards(double feet) {
    return feet * 0.333333;
  }

  public static double convertMetersToInches(double meters) {
    return meters * 39.3701;
  }

  public static double convertInchesToMeters(double inches) {
    return inches * 0.0254;
  }

  public static double convertInchesToCentimeters(double inches) {
    return inches * 2.54;
  }

  public static double convertFahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
  }

  public static double convertCelsiusToFahrenheit(double celsius) {
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
    double value;

    System.out.print("Enter the value to convert: ");
    value = input.nextDouble();

    System.out.println("\nConversions for value: " + value);

    System.out.println(value + " km = " + convertKmToMiles(value) + " miles");
    System.out.println(value + " miles = " + convertMilesToKm(value) + " km");
    System.out.println(value + " meters = " + convertMetersToFeet(value) + " feet");
    System.out.println(value + " feet = " + convertFeetToMeters(value) + " meters");
    System.out.println(value + " yards = " + convertYardsToFeet(value) + " feet");
    System.out.println(value + " feet = " + convertFeetToYards(value) + " yards");
    System.out.println(value + " meters = " + convertMetersToInches(value) + " inches");
    System.out.println(value + " inches = " + convertInchesToMeters(value) + " meters");
    System.out.println(value + " inches = " + convertInchesToCentimeters(value) + " centimeters");
    System.out.println(value + " Fahrenheit = " + convertFahrenheitToCelsius(value) + " Celsius");
    System.out.println(value + " Celsius = " + convertCelsiusToFahrenheit(value) + " Fahrenheit");
    System.out.println(value + " pounds = " + convertPoundsToKilograms(value) + " kilograms");
    System.out.println(value + " kilograms = " + convertKilogramsToPounds(value) + " pounds");
    System.out.println(value + " gallons = " + convertGallonsToLiters(value) + " liters");
    System.out.println(value + " liters = " + convertLitersToGallons(value) + " gallons");

    input.close();
  }
}
