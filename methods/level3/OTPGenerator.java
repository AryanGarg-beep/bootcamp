import java.util.Arrays;

public class OTPGenerator {

  public static final String RESET = "\u001B[0m";
  public static final String RED = "\u001B[31m";
  public static final String GREEN = "\u001B[32m";

  public static int generateOTP() {
    return (int) (Math.random() * 900000) + 100000;
  }

  public static Boolean isUnique(int[] otp) {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (otp[i] == otp[j]) {
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] otp = new int[10];

    for (int i = 0; i < 10; i++) {
      otp[i] = generateOTP();
    }
    System.out.println("Otps are: " + Arrays.toString(otp));

    Boolean isUnique = isUnique(otp);
    System.out.println(isUnique ? GREEN + "unique" + RESET : RED + "Duplicate" + RESET);
  }
}
