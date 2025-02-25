import java.util.Scanner;

class NegetiveZeroPositiveCheck {
  public static void main(String[] args) {
    // making input object
    Scanner sc = new Scanner(System.in);
    // taking input from user
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    sc.close();
    // checking condition and printing the result
    if (num < 0) {
      System.out.println("The number is negetive.");
    } else if (num == 0) {
      System.out.println("The number is zero.");
    } else {
      System.out.println("The number is positive.");
    }
  }
}
