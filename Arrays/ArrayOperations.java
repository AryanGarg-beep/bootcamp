import java.util.Scanner;

public class ArrayOperations {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int array[] = new int[5];
    for (int i = 0; i < 5; i++) {
      array[i] = input.nextInt();
    }
    input.close();
    for (int i = 0; i < array.length; i++) {
      if (array[i] > 0) {
        if (array[i] % 2 == 0) {
          System.out.println(array[i] + " is a positive even number");
        } else {
          System.out.println(array[i] + " is a positive odd number");
        }
      } else if (array[i] < 0) {
        System.out.println("it is a negetive number");
      } else {
        System.out.println("it is zero");
      }
    }
    if (array[0] == array[10]) {
      System.out.println("The Last 2 numbers are equal");
    } else if (array[0] > array[10]) {
      System.out.println("The First number is greater than the last number");
    } else {
      System.out.println("The Last number is greater than the first number");
    }
  }
}
