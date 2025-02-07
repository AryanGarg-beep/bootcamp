public class earthVolumeCalc {
  public static void main(String[] args) {
    int radiusKilometers = 6378;
    double radiusMiles = 6378 / 1.6;
    double volumeKilometers = 4 / 3 * 3.14 * radiusKilometers * radiusKilometers;
    double volumeMiles = 4 / 3 * 3.14 * radiusMiles * radiusMiles;

    System.out.println("The volume of the Earth in cubic-kilometers is " + volumeKilometers
        + " and the volume in cubic-miles is " + volumeMiles);
  }
}
