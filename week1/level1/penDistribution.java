public class penDistribution {
  public static void main(String[] args) {
    int students = 3;
    int pens = 14;
    int pensPerStudent = pens / students;
    int remainingPens = pens % students;

    System.out.println("The pen per student is " + pensPerStudent + " and the remaining pens are " + remainingPens);
  }
}
