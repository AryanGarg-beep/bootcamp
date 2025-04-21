import java.util.Scanner;

public class Calender {
  public static final String ERROR = "\u001B[31;1m";
  public static final String RESET = "\u001B[0m";

  static String[] months = {
      "January", "February", "March", "April", "May", "June",
      "July", "August", "September", "October", "November", "December"
  };

  static int[] days = {
      31, 28, 31, 30, 31, 30,
      31, 31, 30, 31, 30, 31
  };

  public static boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
  }

  public static int getDays(int month, int year) {
    if (month == 1 && isLeapYear(year)) {
      return 29;
    }
    return days[month];
  }

  public static int getFirstDay(int y, int m) {
    m += 1;
    int y0 = y - (14 - m) / 12;
    int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
    int m0 = m + (12 * ((14 - m) / 12)) - 2;
    int d0 = (1 + x + (31 * m0) / 12) % 7;
    return d0;
  }

  public static void display(int year, int month) {
    int firstDay = getFirstDay(year, month);
    int days = getDays(month, year);
    System.out.printf("%s %d \n", months[month], year);
    System.out.println("Sun Mon Tue Wed Thu Fri Sat");
    for (int i = 0; i < firstDay; i++) {
      System.out.print("    ");
    }
    for (int i = 1; i <= days; i++) {
      System.out.printf("%3d ", i);
      if ((i + firstDay) % 7 == 0) {
        System.out.println();
      }
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int year, month;

    while (true) {
      System.out.print("Enter year: ");
      year = input.nextInt();
      System.out.print("Enter Month(1-12): ");
      month = input.nextInt();
      if (month < 1 || month > 12 || year < 0) {
        System.out.println(ERROR + "Invalid Input" + RESET);
      } else {
        month -= 1;
        break;
      }
    }
    System.out.println();
    display(year, month);

    input.close();
  }
}
