import java.util.Scanner;

public class BMICalculator {

    public static String[] computeBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";
        return new String[]{
            String.format("%.2f", heightCm),
            String.format("%.2f", weight),
            String.format("%.2f", bmi),
            status
        };
    }

    public static String[][] processTeam(double[][] hwArray) {
        String[][] result = new String[hwArray.length][4];
        for (int i = 0; i < hwArray.length; i++) {
            result[i] = computeBMI(hwArray[i][0], hwArray[i][1]);
        }
        return result;
    }

    public static void displayTable(String[][] arr) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t\t" + arr[i][1] + "\t\t" + arr[i][2] + "\t\t" + arr[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] hwArray = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            hwArray[i][0] = input.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            hwArray[i][1] = input.nextDouble();
        }
        String[][] result = processTeam(hwArray);
        displayTable(result);
    }
}