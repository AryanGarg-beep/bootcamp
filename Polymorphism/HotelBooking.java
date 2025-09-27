class Booking {
  public void calculatePrice(String roomType, int nights) {
    double rate = getRate(roomType);
    double total = rate * nights;
    System.out.println("Standard Booking: " + roomType + " x " + nights + " nights = ₹" + total);
  }

  public void calculatePrice(String roomType, int nights, double seasonalMultiplier) {
    double rate = getRate(roomType);
    double total = rate * nights * seasonalMultiplier;
    System.out.println("Seasonal Booking: " + roomType + " x " + nights + " nights with multiplier "
        + seasonalMultiplier + " = ₹" + total);
  }

  public void calculatePrice(String roomType, int nights, double corporateDiscount, boolean mealPackage) {
    double rate = getRate(roomType);
    double base = rate * nights;
    double discount = base * (corporateDiscount / 100.0);
    double meals = mealPackage ? 500 * nights : 0;
    double total = base - discount + meals;
    System.out.println("Corporate Booking: " + roomType + " x " + nights + " nights = ₹" + total);
  }

  public void calculatePrice(String roomType, int nights, int guests, double decorationFee, double cateringPerGuest) {
    double rate = getRate(roomType);
    double roomCost = rate * nights;
    double catering = cateringPerGuest * guests;
    double total = roomCost + decorationFee + catering;
    System.out.println("Wedding Package: " + roomType + " x " + nights + " nights = ₹" + total);
  }

  private double getRate(String roomType) {
    if (roomType.equalsIgnoreCase("Deluxe"))
      return 2000;
    if (roomType.equalsIgnoreCase("Suite"))
      return 5000;
    return 1000;
  }
}

public class HotelBooking {
  public static void main(String[] args) {
    Booking hb = new Booking();
    hb.calculatePrice("Standard", 3);
    hb.calculatePrice("Deluxe", 4, 1.5);
    hb.calculatePrice("Suite", 2, 10, true);
    hb.calculatePrice("Deluxe", 2, 100, 5000, 800);
  }
}
