public class Car {
    // TODO: Define instance variables (attributes):
// - brand (String)
// - model (String)
// - year (int)
// - color (String)
// - isRunning (boolean)
    private String brand;
    private String model;
    private int year;
    private String color;
    boolean isRunning;
// TODO: Create a constructor that initializes all attributes
    public Car(String brand, String model, String color, int year, boolean isRunning){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.isRunning = isRunning;
    }
// TODO: Create instance methods:
// - startEngine() - sets isRunning to true, prints message // - stopEngine() - sets isRunning to false, prints message // - displayInfo() - prints all car information
// - getAge() - returns current year minus car year
    public void startEngine(){
        isRunning = true;
        System.out.println("The engine of " + brand + " " + model + " has started.");
    }

    public void getAge(int currentYear){
        int age = currentYear - year;
        System.out.println("The age of the car is: " + age + " years.");
    }
    public static void main(String[] args) {
// TODO: Create 3 different Car objects with different attributes // TODO: Demonstrate calling methods on each object
// TODO: Show how each object maintains its own state
// TODO: Explain in comments: How is this similar to real-world cars?
        Car car1 = new Car("Tata", "harrier", "Red", 2015, false);
        Car car2 = new Car("Honda", "Civic", "Blue", 2018, false);
        Car car3 = new Car("Ford", "Mustang", "Black", 2020, false);

        car1.startEngine();
        car1.getAge(2024);

        car2.startEngine();
        car2.getAge(2024);

        car3.startEngine();
        car3.getAge(2024);

    }
}
