
public class Matrix {

  public static void main(String[] args) {

    int[][] A = generateMatrix(3, 3);
    int[][] B = generateMatrix(3, 3);

    System.out.println("Matrix A:");
    printMatrix(A);
    System.out.println("Matrix B:");
    printMatrix(B);

    System.out.println("A + B:");
    printMatrix(addMatrices(A, B));

    System.out.println("A - B:");
    printMatrix(subtractMatrices(A, B));

    System.out.println("A x B:");
    printMatrix(multiplyMatrices(A, B));

    System.out.println("Transpose of A:");
    printMatrix(transpose(A));

    System.out.println("Determinant of A:");
    System.out.println(determinant3x3(A));

    System.out.println("Inverse of A:");
    double[][] inverseA = inverse3x3(A);
    if (inverseA == null)
      System.out.println("Not invertible");
    else
      printMatrix(inverseA);

  }

  public static int[][] generateMatrix(int rows, int cols) {
    int[][] matrix = new int[rows][cols];
    for (int i = 0; i < rows; i++)
      for (int j = 0; j < cols; j++)
        matrix[i][j] = (int) (Math.random() * 20 - 10);
    return matrix;
  }

  public static int[][] addMatrices(int[][] A, int[][] B) {
    int[][] result = new int[A.length][A[0].length];
    for (int i = 0; i < A.length; i++)
      for (int j = 0; j < A[0].length; j++)
        result[i][j] = A[i][j] + B[i][j];
    return result;
  }

  public static int[][] subtractMatrices(int[][] A, int[][] B) {
    int[][] result = new int[A.length][A[0].length];
    for (int i = 0; i < A.length; i++)
      for (int j = 0; j < A[0].length; j++)
        result[i][j] = A[i][j] - B[i][j];
    return result;
  }

  public static int[][] multiplyMatrices(int[][] A, int[][] B) {
    int[][] result = new int[A.length][B[0].length];
    for (int i = 0; i < A.length; i++)
      for (int j = 0; j < B[0].length; j++)
        for (int k = 0; k < B.length; k++)
          result[i][j] += A[i][k] * B[k][j];
    return result;
  }

  public static int[][] transpose(int[][] matrix) {
    int[][] transposed = new int[matrix[0].length][matrix.length];
    for (int i = 0; i < matrix.length; i++)
      for (int j = 0; j < matrix[0].length; j++)
        transposed[j][i] = matrix[i][j];
    return transposed;
  }

  public static int determinant2x2(int[][] m) {
    return m[0][0] * m[1][1] - m[0][1] * m[1][0];
  }

  public static int determinant3x3(int[][] m) {
    return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
        - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
        + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
  }

  public static double[][] inverse2x2(int[][] m) {
    int det = determinant2x2(m);
    if (det == 0)
      return null;
    double[][] inv = {
        { m[1][1] / (double) det, -m[0][1] / (double) det },
        { -m[1][0] / (double) det, m[0][0] / (double) det }
    };
    return inv;
  }

  public static double[][] inverse3x3(int[][] m) {
    int det = determinant3x3(m);
    if (det == 0)
      return null;

    double[][] inv = new double[3][3];
    inv[0][0] = (m[1][1] * m[2][2] - m[1][2] * m[2][1]) / (double) det;
    inv[0][1] = -(m[0][1] * m[2][2] - m[0][2] * m[2][1]) / (double) det;
    inv[0][2] = (m[0][1] * m[1][2] - m[0][2] * m[1][1]) / (double) det;

    inv[1][0] = -(m[1][0] * m[2][2] - m[1][2] * m[2][0]) / (double) det;
    inv[1][1] = (m[0][0] * m[2][2] - m[0][2] * m[2][0]) / (double) det;
    inv[1][2] = -(m[0][0] * m[1][2] - m[0][2] * m[1][0]) / (double) det;

    inv[2][0] = (m[1][0] * m[2][1] - m[1][1] * m[2][0]) / (double) det;
    inv[2][1] = -(m[0][0] * m[2][1] - m[0][1] * m[2][0]) / (double) det;
    inv[2][2] = (m[0][0] * m[1][1] - m[0][1] * m[1][0]) / (double) det;

    return inv;
  }

  public static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      for (int val : row)
        System.out.printf("%5d", val);
      System.out.println();
    }
  }

  public static void printMatrix(double[][] matrix) {
    for (double[] row : matrix) {
      for (double val : row)
        System.out.printf("%8.2f", val);
      System.out.println();
    }
  }
}
