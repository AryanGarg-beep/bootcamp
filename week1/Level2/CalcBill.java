import java.util.Scanner;

public class CalcBill {
  public static void main(String[] args) {
    // input object creation
    Scanner input = new Scanner(System.in);
    int unitPrice, quantity;

    // taking input from user
    System.out.print("Enter the unit price of the item: ");
    unitPrice = input.nextInt();
    System.out.print("Enter the quantity of the item: ");
    quantity = input.nextInt();

    // Calculations
    int totalBill = unitPrice * quantity;

    // printing the output
    System.out.println("The total purchase price is INR " + totalBill + " if the quantity is " + quantity
        + " and the unit price is INR " + unitPrice);

    input.close();
  }
}
