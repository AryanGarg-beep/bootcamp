import java.util.Scanner;

/**
 * calcHeight
 */
public class calcHeight {
  public static void main(String[] args) {
    double centimeterHeight;
    Scanner input = new Scanner(System.in);
    centimeterHeight = input.nextDouble();
    double inchHeight = centimeterHeight / 2.34;
    double footHeight = inchHeight / 12;

    System.out.println("Height in centimeters is " + centimeterHeight + " while height in inches is " + inchHeight
        + "and in feet is " + footHeight);
  }
}
