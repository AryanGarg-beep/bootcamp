import java.util.Scanner;

public class CalculateBonus {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double bonus;
    // taking input
    System.out.print("Enter the year: ");
    int year = input.nextInt();
    System.out.print("Enter current salary: ");
    double salary = input.nextDouble();
    input.close();

    // Calculation
    if (year > 5) {
      bonus = salary * 0.05;
      // Printing the output
      System.out.println("Bonus is: " + bonus);
    } else {
      System.out.println("You are not eligible");
    }
  }
}
