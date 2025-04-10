import java.util.Scanner;

public class LeapYear {
  public static boolean leap(int year) {
    return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);

  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int year;
    while (true) {
      System.out.print("Enter an year: ");
      year = input.nextInt();
      if (year >= 1582)
        break;
      System.out.println("\u001B[31;1mWhat are u even doing?\u001B[0m");
    }
    if (leap(year)) {
      System.out.println("It is a leap year");
    } else {
      System.out.println("It is not a leap year");
    }
    input.close();
  }
}
