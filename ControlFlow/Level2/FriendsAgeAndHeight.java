import java.util.Scanner;

public class FriendsAgeAndHeight {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // taking user input for ages
    System.out.println("Enter the ages of Amar, Akbar and Anthony-");
    int amarAge = input.nextInt();
    int akbarAge = input.nextInt();
    int anthonyAge = input.nextInt();

    // taking user input for heights
    System.out.println("Enter Their heights(in centimeters-");
    int amarHeight = input.nextInt();
    int akbarHeight = input.nextInt();
    int anthonyHeight = input.nextInt();
    input.close();

    // Condition for ages
    if (amarAge < akbarAge && amarAge < anthonyAge) {
      System.out.println("Amar is the youngest");
    } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
      System.out.println("Akbar is the youngest");
    } else {
      System.out.println("Anthony is the youngest");
    }

    // Condition for heights
    if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
      System.out.println("Amar is the tallest");
    } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
      System.out.println("Akbar is the tallest");
    } else {
      System.out.println("Anthony is the tallest");
    }

  }
}
