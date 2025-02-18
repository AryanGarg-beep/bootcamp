import java.util.Scanner;

public class TriangluarParkRun {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter side1 in meters: ");
        double side1 = input.nextDouble();
        System.out.print("Enter side2 in meters: ");
        double side2 = input.nextDouble();
        System.out.print("Enter side3 in meters: ");
        double side3 = input.nextDouble();
        
        // Calculation
        double perimeter = side1 + side2 + side3;
        double rounds = 5000 / perimeter;
        
        // Output result
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
        input.close();
    }
}
