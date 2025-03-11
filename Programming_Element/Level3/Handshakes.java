import java.util.Scanner;

public class Handshakes {
  public static void main(String[] args) {
    // Create Scanner object
    Scanner input = new Scanner(System.in);

    // Take user input
    System.out.print("Enter number of students: ");
    int numberOfStudents = input.nextInt();
    input.close();

    // Calculation
    int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

    // Output result
    System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + handshakes);
  }
}
