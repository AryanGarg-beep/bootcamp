import java.util.Scanner;
import java.util.ArrayList;

public class OddEvenArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    input.close();

    if (number < 0) {
      System.err.println("Number should be natural");
      System.exit(1);
    }

    ArrayList<Integer> odd = new ArrayList<>();
    ArrayList<Integer> even = new ArrayList<>();

    for (int i = 1; i < number; i++) {
      if (i % 2 != 0) {
        odd.add(i);
      } else {
        even.add(i);
      }
    }

    System.out.println("Odd numbers:");
    for (int i = 0; i < odd.size(); i++) {
      System.out.print(odd.get(i) + " ");
    }
    System.out.println("\nEven numbers:");
    for (int i = 0; i < even.size(); i++) {
      System.out.print(even.get(i) + " ");
    }
  }
}
