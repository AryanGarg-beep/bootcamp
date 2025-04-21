import java.util.Random;

public class FootballTeamHeights {
  public static int[] generateHeights(int size) {
    int[] heights = new int[size];
    Random rand = new Random();
    for (int i = 0; i < size; i++) {
      heights[i] = rand.nextInt(101) + 150;
    }
    return heights;
  }

  public static int findSum(int[] arr) {
    int sum = 0;
    for (int num : arr) {
      sum += num;
    }
    return sum;
  }

  public static double findMean(int[] arr) {
    return (double) findSum(arr) / arr.length;
  }

  public static int findMin(int[] arr) {
    int min = arr[0];
    for (int num : arr) {
      if (num < min)
        min = num;
    }
    return min;
  }

  public static int findMax(int[] arr) {
    int max = arr[0];
    for (int num : arr) {
      if (num > max)
        max = num;
    }
    return max;
  }

  public static void main(String[] args) {
    int[] heights = generateHeights(11);

    System.out.println("Player Heights (cm):");
    for (int i = 0; i < heights.length; i++) {
      System.out.println("Player " + (i + 1) + ": " + heights[i] + "cm");
    }

    System.out.println("\nTeam Height Analysis:");
    System.out.println("Shortest: " + findMin(heights) + "cm");
    System.out.println("Tallest: " + findMax(heights) + "cm");
    System.out.printf("Mean: %.1fcm", findMean(heights));
  }
}
