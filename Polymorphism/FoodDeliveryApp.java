class DeliveryCalculator {
  public static void calculateDelivery(double distance) {
    double cost = distance * 10;
    System.out.println("Basic Delivery: ₹" + cost);
  }

  public static void calculateDelivery(double distance, double priorityFee) {
    double cost = distance * 10 + priorityFee;
    System.out.println("Premium Delivery: ₹" + cost);
  }

  public static void calculateDelivery(double distance, int numberOfOrders) {
    double cost = distance * 10 - numberOfOrders * 5;
    if (cost < 0)
      cost = 0;
    System.out.println("Group Delivery: ₹" + cost);
  }

  public static void calculateDelivery(double distance, double discountPercent, double freeThreshold) {
    double baseCost = distance * 10;
    if (baseCost > freeThreshold) {
      System.out.println("Festival Delivery: FREE");
    } else {
      double finalCost = baseCost - baseCost * (discountPercent / 100.0);
      System.out.println("Festival Delivery: ₹" + finalCost);
    }
  }
}

public class FoodDeliveryApp {
  public static void main(String[] args) {
    DeliveryCalculator.calculateDelivery(5);
    DeliveryCalculator.calculateDelivery(5, 20.0);
    DeliveryCalculator.calculateDelivery(5, 3);
    DeliveryCalculator.calculateDelivery(8, 20.0, 100.0);
  }
}
