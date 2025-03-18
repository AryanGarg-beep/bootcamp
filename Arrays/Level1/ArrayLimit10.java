import java.util.Scanner;

public class ArrayLimit10 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int arr[] = new int[10];

    System.out.println("Enter numbers: ");
    for (int i = 0; i < 10; i++) {
      arr[i] = input.nextInt();
      if (i == 9) {
        System.err.println("\u001B[31;1m\tArray is full\n\u001B[0m");
        break;
      } else if (arr[i] == 0 || arr[i] < 0) {
        System.err.println("\u001B[31;1m\tD E A T H\n\u001B[0m");
        break;
      }
    }
    input.close();

    System.out.println("The array is: ");
    for (int i : arr) {
      System.out.print(i + " ");
    }
    for (int i = 0; i < 10; i++) {
      arr[0] += arr[i];
    }
    System.out.println("\nThe sum of the elements is " + arr[0]);
  }
}
