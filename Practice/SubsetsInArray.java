import java.util.*;

public class SubsetsInArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] arr = { 20, 30, 40, 50, 60, 70, 800, 90, 10 }; // Example array
    System.out.print("Enter the subset size: ");
    int i = scanner.nextInt();
    List<List<Integer>> result = new ArrayList<>();

    generateSubsets(arr, i, 0, new ArrayList<>(), result);

    System.out.println("All " + i + "-element subsets:");
    for (List<Integer> subset : result) {
      System.out.println(subset);
    }
    scanner.close();
  }

  private static void generateSubsets(int[] arr, int i, int start, List<Integer> current, List<List<Integer>> result) {
    if (current.size() == i) {
      result.add(new ArrayList<>(current));
      return;
    }
    for (int j = start; j < arr.length; j++) {
      current.add(arr[j]);
      generateSubsets(arr, i, j + 1, current, result);
      current.remove(current.size() - 1);
    }
  }
}
