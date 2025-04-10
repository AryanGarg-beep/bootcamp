import java.util.Scanner;

public class Charlie {
  public static int[] distribution(int n, int m) {
    int perStudent = n / m;
    int left = n % m;
    return new int[] { perStudent, left };
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of chocolates: ");
    int n = input.nextInt();
    System.out.print("Enter the number of students: ");
    int m = input.nextInt();

    int[] result = distribution(m, n);

    System.out.println(
        "Number of chocolates per student is " + result[0] + " and there are " + result[1] + " chocolates left");
    input.close();
  }

}
