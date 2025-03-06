import java.util.Scanner;

public class LeapYearWithLogic {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // taking input from user
    System.out.print("Enter a year: ");
    int year = input.nextInt();
    input.close();
    // checking condition and printing the result
    if (year <= 1582) {
      System.out.println("Please enter a valid year");
    } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      System.out.println(year + " is a leap year");
    } else {
      System.out.println(year + " is not a leap year");
    }
  }
}
