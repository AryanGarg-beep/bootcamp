import java.util.Scanner;

public class feeDiscountInput {
  public static void main(String[] args) {
    int fee, discountPercent;
    Scanner input = new Scanner(System.in);
    fee = input.nextInt();
    discountPercent = input.nextInt();

    double discount = fee * discountPercent / 100;
    double finalFee = fee - discount;

    System.out.println("The discount amount is INR " + discount + " and the discounted fee is INR " + finalFee);
  }
}
