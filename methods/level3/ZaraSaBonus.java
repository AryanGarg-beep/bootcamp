public class ZaraSaBonus {

  public static void main(String[] args) {
    int[][] employeeData = generateEmployeeData(10);
    double[][] salaryBonusData = calculateBonus(employeeData);
    displayTable(employeeData, salaryBonusData);
  }

  public static int[][] generateEmployeeData(int numEmployees) {
    int[][] data = new int[numEmployees][2];
    for (int i = 0; i < numEmployees; i++) {
      int salary = 10000 + (int) (Math.random() * 90000);
      int years = 1 + (int) (Math.random() * 10);
      data[i][0] = salary;
      data[i][1] = years;
    }
    return data;
  }

  public static double[][] calculateBonus(int[][] data) {
    double[][] result = new double[data.length][2];
    for (int i = 0; i < data.length; i++) {
      int salary = data[i][0];
      int years = data[i][1];
      double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
      double newSalary = salary + bonus;
      result[i][0] = bonus;
      result[i][1] = newSalary;
    }
    return result;
  }

  public static void displayTable(int[][] data, double[][] salaryBonusData) {
    double totalOld = 0, totalBonus = 0, totalNew = 0;

    System.out.printf("%-5s %-10s %-10s %-10s %-12s\n", "Emp", "Old", "Years", "Bonus", "New Salary");
    System.out.println("------------------------------------------------------");

    for (int i = 0; i < data.length; i++) {
      int salary = data[i][0];
      int years = data[i][1];
      double bonus = salaryBonusData[i][0];
      double newSalary = salaryBonusData[i][1];

      totalOld += salary;
      totalBonus += bonus;
      totalNew += newSalary;

      System.out.printf("%-5d %-10d %-10d %-10.2f %-12.2f\n",
          i + 1, salary, years, bonus, newSalary);
    }

    System.out.println("------------------------------------------------------");
    System.out.printf("%-5s %-10.2f %-10s %-10.2f %-12.2f\n",
        "Total", totalOld, "", totalBonus, totalNew);
  }
}
