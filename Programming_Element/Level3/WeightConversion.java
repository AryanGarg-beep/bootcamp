import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();
        
        // Calculation
        double weightInKg = weightInPounds / 2.2;
        
        // Output result
        System.out.println("The weight of the person in pound is " + weightInPounds + " and in kg is " + weightInKg);
    }
}
