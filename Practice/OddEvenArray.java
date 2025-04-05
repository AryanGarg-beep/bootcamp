import java.util.Scanner;

public class OddEvenArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    int[] arr = new int[num];
    int[] duplicate = new int[num];
    for (int i = 0; i < num; i++) {
      arr[i] = input.nextInt();
      duplicate[i] = arr[i];
    }
    int even = 0, odd = 0;
    for (int i = 0; i < num; i++) {
      if (duplicate[i] % 2 == 0) {
        arr[num - 1 - i] = duplicate[i];
        even++;
      }
      System.out.print(arr[i]);
      System.out.println("check: " + even + "\n");
    }
  }
}
