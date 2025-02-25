public class CalcProfitLoss {
  public static void main(String[] args) {
    int costPrice = 129, sellPrice = 191, profit = sellPrice - costPrice;
    double profitPercentage = profit / (double) costPrice * 100.0;

    System.out.println("The cost price is INR " + costPrice + " and selling price is INR " + sellPrice);
    System.out.println("The profit is INR " + profit + " and the profit percentage is " + profitPercentage);
  }
}
