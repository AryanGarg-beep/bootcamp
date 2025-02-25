import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter bonus: ");
        double bonus = input.nextDouble();
        
        // Calculation
        double income = salary + bonus;
        
        // Output result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + income);
        input.close();
    }
}
