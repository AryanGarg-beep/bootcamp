import java.util.Scanner;

public class SimpleInterest {

  // method for calling the functions
  public double interest(int principle, double rate, int time) {
    double interest = principle * rate * time * 0.01;
    return interest;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter principle: ");
    int principle = input.nextInt();
    System.out.print("Enter rate: ");
    double rate = input.nextDouble();
    System.out.print("Enter time: ");
    int time = input.nextInt();

    // making the object for invokking the function and calling it
    SimpleInterest interest = new SimpleInterest();
    double answer = interest.interest(principle, rate, time);
    System.out.println("\nThe simple Interest is " + answer + " for principle " + principle + " and time " + time);
    input.close();
  }
}
