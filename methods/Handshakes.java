import java.util.Scanner;

public class Handshakes {

  // method for calculations
  public int numberOfShakes(int n) {
    int total = (n * (n - 1)) / 2;
    return total; // returning the asnwer to the main block
  };

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of students: ");
    int n = input.nextInt();

    // making the object for invoking the functions
    Handshakes handshakes = new Handshakes();

    // calling the functions
    int result = handshakes.numberOfShakes(n);
    System.out.println("The number of handshakes are: " + result);
    input.close();
  }
}
