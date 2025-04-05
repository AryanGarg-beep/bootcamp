
public class TaleOf2Arrys {
  public static void main(String[] args) {
    int[] arr1 = { 1, 3, 5, 7, 9 };
    int[] arr2 = { 2, 7, 8, 10 };

    int[] result = new int[arr1.length + arr2.length];

    for (int i = 0; i < arr1.length; i++) {
      result[i] = arr1[i];
    }
    for (int i = 0; i < arr2.length; i++) {
      result[arr1.length + i] = arr2[i];
    }
    for (int i : result) {
      System.out.print(i + " ");
    }
    System.out.println();

    int i = 0;
    int j = 0;
    int k = 0;
    while (i < arr1.length && j < arr2.length) {
      result[k++] = arr1[i++];
      result[k++] = arr2[j++];
    }
    for (int z : result) {
      System.out.print(z + " ");
    }
  }
}
