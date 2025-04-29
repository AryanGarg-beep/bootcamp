import java.util.Random;

public class RandomNumbers {

  public static int[] generate4DigitRandomArray(int size) {
    Random rand = new Random();
    int[] numbers = new int[size];
    for (int i = 0; i < size; i++) {
      numbers[i] = 1000 + rand.nextInt(9000);
    }
    return numbers;
  }

  public static double[] findAverageMinMax(int[] numbers) {
    double sum = 0;
    int min = numbers[0];
    int max = numbers[0];
    for (int num : numbers) {
      sum += num;
      if (num < min)
        min = num;
      if (num > max)
        max = num;
    }
    double average = sum / numbers.length;
    return new double[] { average, min, max };
  }

  public static void main(String[] args) {
    int[] randomNumbers = generate4DigitRandomArray(5);
    double[] results = findAverageMinMax(randomNumbers);

    System.out.println("Generated random numbers:");
    for (int num : randomNumbers) {
      System.out.print(num + " ");
    }
    System.out.println();

    System.out.println("Average: " + results[0]);
    System.out.println("Minimum: " + results[1]);
    System.out.println("Maximum: " + results[2]);
  }
}
