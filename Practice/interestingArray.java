class interestingArray {
  public int[] sortedSquares(int[] nums) {
    int n = nums.length;
    int arr1[] = new int[n];
    int arr2[] = new int[n];
    int result[] = new int[n];
    int a = 0;
    int b = 0;
    for (int i = 0; i < n; i++) {
      if (nums[i] >= 0) {
        arr1[a++] = nums[i] * nums[i];
      } else {
        arr2[b++] = nums[i] * nums[i];
      }
    }

    int i = 0, j = b - 1, k = 0;

    while (i < a && j >= 0) {
      if (arr1[i] < arr2[j]) {
        result[k++] = arr1[i++];
      } else {
        result[k++] = arr2[j--];
      }
    }
    while (i < a) {
      result[k++] = arr1[i++];
    }
    while (j >= 0) {
      result[k++] = arr2[j--];
    }
    return result;
  }
}

// This is fast as there is no complexities in merging 2 arrays
