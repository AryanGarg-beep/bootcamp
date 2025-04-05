import java.util.Scanner;

public class SpringSeason {

  // Method to check for Spring Season
  public static boolean isSpring(int month, int day) {
    return (month == 3 && day >= 20 && day <= 31) ||
        (month == 4 && day >= 1 && day <= 30) ||
        (month == 5 && day >= 1 && day <= 31) ||
        (month == 6 && day >= 1 && day <= 20);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter month: ");
    int month = input.nextInt();
    System.out.print("Enter day: ");
    int day = input.nextInt();
    if (isSpring(month, day)) {
      System.out.println("It's a Spring Season");
    } else {
      System.out.println("Not a Spring Season");
    }
    input.close();
  }
}
