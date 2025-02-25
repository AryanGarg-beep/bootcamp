import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter number1: ");
        double number1 = input.nextDouble();
        System.out.print("Enter number2: ");
        double number2 = input.nextDouble();
        
        // Calculation (Swapping numbers)
        double temp = number1;
        number1 = number2;
        number2 = temp;
        
        // Output result
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
}
