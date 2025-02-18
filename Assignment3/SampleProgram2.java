import java.util.Scanner;

public class SampleProgram2 {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter fromCity: ");
        String fromCity = input.nextLine();
        System.out.print("Enter viaCity: ");
        String viaCity = input.nextLine();
        System.out.print("Enter toCity: ");
        String toCity = input.nextLine();
        System.out.print("Enter distance fromToVia in miles: ");
        double fromToVia = input.nextDouble();
        System.out.print("Enter distance viaToFinalCity in miles: ");
        double viaToFinalCity = input.nextDouble();
        System.out.print("Enter time taken: ");
        double timeTaken = input.nextDouble();
        
        // Output result
        System.out.println("name: " + name +"\nfromCity: " + fromCity + "\nviaCity: " + viaCity + "\ntoCity: " + toCity + "\nfromToVia: " + fromToVia + "\nviaToFinalCity: " + viaToFinalCity + "\ntimeTaken: " + timeTaken);
        input.close();
    }
}
