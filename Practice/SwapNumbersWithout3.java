public class SwapNumbersWithout3 {
  public static void main(String[] args) {
    int a = 10, b = 20;
    a = ~(b - 1);
    System.out.println(-a);
    b = ~(a - b);
    System.out.println(-b);
  }
}
