public class OddEvenIndexAdd {
  public static void main(String[] args) {
    int sum = 0;
    int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 10 };
    for (int i = 0; i < 10; i += 2) {
      sum += a[i];
    }
    System.out.println(sum);

    sum = 0;
    for (int i = 1; i < 10; i += 2) {
      sum += a[i];
    }
    System.out.println(sum);

    sum = 0;
    int j = 0, k = 1, l = 0;
    while (l < a.length - 1) {
      sum += a[l];
      l = k + j;
      k = j;
      j = l;
    }
    System.out.println(sum);

    for (int i = 0; i < 9; i++) {
      a[i] = a[i + 1];
    }
    for (int i = 0; i < 10; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println();

    for (int i = 9; i >= 0; i--) {
      System.out.print(a[i] + " ");
    }
  }
}
