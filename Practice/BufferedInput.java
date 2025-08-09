import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedInput {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.println("Enter a sentence: ");
            String sentence = reader.readLine();
            // Read single word (stops at whitespace)
            System.out.print("Enter your first name: ");
            String firstName = reader.readLine().trim();

            // Read entire line (includes spaces)
            System.out.print("Enter your full name: ");
            String fullName = reader.readLine().trim();

            // Input validation example
            System.out.print("Enter your age: ");
            String ageInput = reader.readLine();
            int age;
            try {
                age = Integer.parseInt(ageInput);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number for age.");
                return; // Exit if invalid input
            }
            System.out.println("You entered: " + sentence);
            System.out.println("First name: " + firstName);
            System.out.println("Full name: " + fullName);
            System.out.println("Age: " + age);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}