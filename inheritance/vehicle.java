import java.util.Random;

public class Vehicle {
  // Protected fields (accessible to subclasses)
  protected String brand;
  protected String model;
  protected int year;
  protected String engineType;

  // Private fields (encapsulated)
  private String registrationNumber;
  private boolean isRunning;

  // Default constructor
  public Vehicle() {
    this.brand = "Unknown";
    this.model = "Unknown";
    this.year = 0;
    this.engineType = "Unknown";
    this.registrationNumber = generateRegistrationNumber();
    this.isRunning = false;
    System.out.println("Vehicle default constructor called");
  }

  // Parameterized constructor
  public Vehicle(String brand, String model, int year, String engineType) {
    this.brand = brand;
    this.model = model;
    this.year = year;
    this.engineType = engineType;
    this.registrationNumber = generateRegistrationNumber();
    this.isRunning = false;
    System.out.println("Vehicle parameterized constructor called");
  }

  // Private helper for random registration number
  private String generateRegistrationNumber() {
    Random rand = new Random();
    return "REG-" + (1000 + rand.nextInt(9000));
  }

  // Vehicle operations
  public void start() {
    isRunning = true;
    System.out.println("Vehicle started");
  }

  public void stop() {
    isRunning = false;
    System.out.println("Vehicle stopped");
  }

  public String getVehicleInfo() {
    return "Brand: " + brand + ", Model: " + model + ", Year: " + year +
        ", Engine: " + engineType + ", Reg#: " + registrationNumber +
        ", Running: " + isRunning;
  }

  public void displaySpecs() {
    System.out.println("Vehicle Specs:");
    System.out.println("Brand: " + brand);
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
    System.out.println("Engine Type: " + engineType);
  }

  // Getter/Setter for registrationNumber
  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  // Getter for isRunning (no setter)
  public boolean isRunning() {
    return isRunning;
  }
}

// Car class
class Car extends Vehicle {
  // Car-specific fields
  private int numberOfDoors;
  private String fuelType;
  private String transmissionType;

  // Default constructor
  public Car() {
    super(); // Calls Vehicle default constructor
    this.numberOfDoors = 4;
    this.fuelType = "Petrol";
    this.transmissionType = "Manual";
    System.out.println("Car default constructor called");
  }

  // Parameterized constructor
  public Car(String brand, String model, int year, String engineType,
      int numberOfDoors, String fuelType, String transmissionType) {
    super(brand, model, year, engineType); // Calls Vehicle parameterized constructor
    this.numberOfDoors = numberOfDoors;
    this.fuelType = fuelType;
    this.transmissionType = transmissionType;
    System.out.println("Car parameterized constructor called");
  }

  // Override start()
  @Override
  public void start() {
    super.start(); // Call parent implementation
    System.out.println("Car-specific startup: Checking seatbelts, adjusting mirrors...");
  }

  // Override displaySpecs()
  @Override
  public void displaySpecs() {
    super.displaySpecs(); // Show vehicle specs first
    System.out.println("Car Specs:");
    System.out.println("Doors: " + numberOfDoors);
    System.out.println("Fuel Type: " + fuelType);
    System.out.println("Transmission: " + transmissionType);
  }

  // Car-specific methods
  public void openTrunk() {
    System.out.println("Trunk opened");
  }

  public void playRadio() {
    System.out.println("Radio playing music");
  }

  // Main method to test
  public static void main(String[] args) {
    // Test constructor chaining
    System.out.println("=== Creating Car with default constructor ===");
    Car car1 = new Car();
    car1.displaySpecs();
    car1.start();
    car1.stop();

    System.out.println("\n=== Creating Car with parameterized constructor ===");
    Car car2 = new Car("Toyota", "Camry", 2022, "Hybrid", 4, "Petrol", "Automatic");
    car2.displaySpecs();
    car2.start();
    car2.playRadio();
    car2.openTrunk();
    car2.stop();

    // Test inheritance and field access
    System.out.println("\n=== Inherited field access ===");
    System.out.println("Brand (protected): " + car2.brand);

    // Test polymorphism
    System.out.println("\n=== Polymorphism ===");
    Vehicle v = new Car("Honda", "Civic", 2023, "Petrol", 4, "Petrol", "Manual");
    v.start(); // Calls Car's overridden start()
    v.displaySpecs(); // Calls Car's overridden displaySpecs()
  }
}
