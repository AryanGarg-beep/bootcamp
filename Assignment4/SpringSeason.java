import java.util.Scanner;

public class SpringSeason {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // taking user input
    System.out.println("Enter month and day: ");
    int moth = input.nextInt();
    int day = input.nextInt();
    input.close();
    // checking condition and printing the result
    if (moth > 12 || moth < 1 || day < 1 || day > 31) {// checking for invalid input
      System.out.println("Invalid input.");
    } else if (moth < 3 || moth > 6) {
      System.out.println("Its not spring season.");
    } else if (moth == 3 && day >= 20) {
      System.out.println("Its spring season.");
    } else if (moth == 6 && day <= 20) {
      System.out.println("Its spring season.");
    } else {
      System.out.println("Its spring season.");
    }
  }
}
