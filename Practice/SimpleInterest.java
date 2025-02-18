import java.util.Scanner;

public class SimpleInterest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double principal, rate, time, simpleInterest;
    principal = input.nextDouble();
    rate = input.nextDouble();
    time = input.nextDouble();
    input.close();

    simpleInterest = principal * rate * time / 100;

    System.out.println(
        "Simple Interest: " + simpleInterest + " for principal: " + principal + " rate: " + rate + " time: " + time);
  }
}
