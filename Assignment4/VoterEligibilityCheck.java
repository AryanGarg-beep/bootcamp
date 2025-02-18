import java.util.Scanner;

public class VoterEligibilityCheck {
  public static void main(String[] args) {
    // making scanner object
    Scanner input = new Scanner(System.in);
    int age;
    // taking input from user
    System.out.println("Enter your age: ");
    age = input.nextInt();
    input.close();
    // checking conditions and printing output
    if (age >= 18) {
      System.out.println("The person's age is " + age + " and is eligible to vote");
    } else {
      System.out.println("The person's age is " + age + " and is not eligible to vote");
    }
  }
}
