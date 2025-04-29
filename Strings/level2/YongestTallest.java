import java.util.Scanner;

public class YoungestTallest {

  public static int findYoungest(int[] ages) {
    int youngest = ages[0];
    for (int i = 1; i < ages.length; i++) {
      if (ages[i] < youngest) {
        youngest = ages[i];
      }
    }
    return youngest;
  }

  public static int findTallest(double[] heights) {
    double tallest = heights[0];
    for (int i = 1; i < heights.length; i++) {
      if (heights[i] > tallest) {
        tallest = heights[i];
      }
    }
    return (int) tallest;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] ages = new int[3];
    double[] heights = new double[3];

    // Taking input for ages and heights of 3 friends
    for (int i = 0; i < 3; i++) {
      System.out.print("Enter the age of friend " + (i + 1) + ": ");
      ages[i] = input.nextInt();
      System.out.print("Enter the height of friend " + (i + 1) + " in cm: ");
      heights[i] = input.nextDouble();
    }

    // Find and print the youngest and tallest friend
    int youngest = findYoungest(ages);
    int tallest = findTallest(heights);

    System.out.println("The youngest friend is " + youngest + " years old.");
    System.out.println("The tallest friend is " + tallest + " cm tall.");

    input.close();
  }
}
