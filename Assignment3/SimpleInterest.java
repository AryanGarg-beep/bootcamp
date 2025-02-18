import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter time: ");
        double time = input.nextDouble();
        
        // Calculation
        double simpleInterest = (principal * rate * time) / 100;
        
        // Output result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
        input.close();
    }
}
