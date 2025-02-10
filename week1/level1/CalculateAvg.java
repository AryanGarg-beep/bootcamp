public class calculateAvg {
  public static void main(String[] args) {
    int markMaths = 94, markPhysics = 95, markChemistry = 96;
    double average = (markMaths + markChemistry + markPhysics) / 300.0;
    double percentage = average * 100;

    System.out.println(average);
    System.out.println("Sam's average mark in PCM is " + percentage + "%");
  }
}
