import java.util.Scanner;

public class YoungOldest {
  public static int min(int arr[]) {
    int min = arr[0];
    int index = 0;
    for (int i = 0; i < 3; i++) {
      if (min > arr[i]) {
        index = i;
      }
    }
    return index;
  }

  public static int max(int arr[]) {
    int max = arr[0];
    int index = 0;
    for (int i = 0; i < 3; i++) {
      if (max < arr[i]) {
        index = i;
      }
    }
    return index;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] age = new int[3];
    int[] height = new int[3];
    String[] names = { "Amar", "Akbar", "Anthony" };

    for (int i = 0; i < 3; i++) {
      while (true) {
        System.out.print("Enter age for " + names[i] + ":");
        age[i] = input.nextInt();
        if (age[i] > 0)
          break;
        System.out.println("\u001B[31;1mNot a valid input\u001B[0m");
      }
    }
    for (int i = 0; i < 3; i++) {
      while (true) {
        System.out.print("Enter height for " + names[i] + ":");
        height[i] = input.nextInt();
        if (height[i] > 0)
          break;
        System.out.println("\u001B[31;1mNot a valid input\u001B[0m");
      }
    }
    System.out.println("\nThe youngest is " + names[min(age)]);
    System.out.println("The oldest is " + names[max(age)]);
    System.out.println("The Shortest is " + names[min(height)]);
    System.out.println("The tallest is " + names[max(height)]);
    input.close();
  }
}
