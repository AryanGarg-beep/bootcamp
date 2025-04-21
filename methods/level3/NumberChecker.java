import java.util.Scanner;
import java.util.Arrays;

public class NumberChecker {

  // COLORS!
  public static final String RESET = "\u001B[0m";
  public static final String CYAN = "\u001B[36m";
  public static final String YELLOW = "\u001B[33m";
  public static final String GREEN = "\u001B[32m";
  public static final String PURPLE = "\u001B[35m";
  public static final String YES = " ✓ Yes";
  public static final String NO = "\u001B[31m ✗ No   \u001B[0m";

  // Count digits in the number
  public static int countDigits(int num) {
    if (num == 0)
      return 1;
    int count = 0;
    num = Math.abs(num);
    while (num > 0) {
      num = num / 10;
      count++;
    }
    return count;
  }

  // Extract digits into array
  public static int[] getDigits(int num, int count) {
    int[] digits = new int[count];
    num = Math.abs(num);
    for (int i = count - 1; i >= 0; i--) {
      digits[i] = num % 10;
      num /= 10;
    }
    return digits;
  }

  // Check for Duck number
  public static boolean duckCheck(int[] digits) {
    for (int i : digits) {
      if (i == 0)
        return true;
    }
    return false;
  }

  // Check for Armstrong number
  public static boolean armstrongCheck(int[] digits, int number) {
    int sum = 0;
    int power = digits.length;
    for (int i : digits) {
      sum += Math.pow(i, power);
    }
    return sum == number;
  }

  // Find two largest digits
  public static int[] largerDigit(int[] digits) {
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    for (int i : digits) {
      if (i > largest) {
        secondLargest = largest;
        largest = i;
      } else if (i > secondLargest) {
        secondLargest = i;
      }
    }
    if (secondLargest == Integer.MIN_VALUE) {
      secondLargest = largest;
    }
    return new int[] { largest, secondLargest };
  }

  // Find two smallest digits
  public static int[] smallerDigit(int[] digits) {
    int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;
    for (int i : digits) {
      if (i < smallest) {
        secondSmallest = smallest;
        smallest = i;
      } else if (i < secondSmallest) {
        secondSmallest = i;
      }
    }
    if (secondSmallest == Integer.MAX_VALUE) {
      secondSmallest = smallest;
    }
    return new int[] { smallest, secondSmallest };
  }

  // Calculate sum of squared digits
  public static int sumOfSquares(int[] digits) {
    int sum = 0;
    for (int i : digits) {
      sum += i * i;
    }
    return sum;
  }

  // Calculate sum of digits
  public static int sumOfDigits(int[] digits) {
    int sum = 0;
    for (int i : digits) {
      sum += i;
    }
    return sum;
  }

  // get product of digits
  public static int productOfDigits(int[] digits) {
    int product = 1;
    for (int i : digits) {
      product *= i;
    }
    return product;
  }

  // Check for Harshad number
  public static boolean harshadCheck(int number, int sum) {
    return number % sum == 0;
  }

  // Calculate digit frequency
  public static int[][] digitFrequency(int[] digits, boolean prettyPrint) {
    int[] freq = new int[10];
    for (int i : digits) {
      freq[i]++;
    }

    int count = 0;
    for (int i : freq) {
      if (i > 0)
        count++;
    }

    int[][] res = new int[count][2];
    int index = 0;

    // Table UI with toggle
    if (prettyPrint) {
      // Top border
      System.out.println(PURPLE + "┌────────┬───────────┐");
      // Header
      System.out.printf(PURPLE + "│ " + CYAN + "%-6s" + PURPLE + " │ " +
          CYAN + "%-9s" + PURPLE + " │%n", "Digit", "Frequency");
      // Middle divider
      System.out.println(PURPLE + "├────────┼───────────┤");
    }

    for (int i = 0; i < freq.length; i++) {
      if (freq[i] > 0) {
        res[index][0] = i;
        res[index][1] = freq[i];
        if (prettyPrint) {
          System.out.printf(PURPLE + "│ " + YELLOW + "%-6d" + PURPLE + " │ " +
              GREEN + "%-9d" + PURPLE + " │%n", i, freq[i]);
        }
        index++;
      }
    }

    if (prettyPrint) {
      // Bottom border
      System.out.println(PURPLE + "└────────┴───────────┘" + RESET);
    }
    return res;
  }

  // get reversed number
  public static int getReverse(int num) {
    int reverse = 0;
    while (num != 0) {
      int digit = num % 10;
      reverse = reverse * 10 + digit;
      num /= 10;
    }
    return reverse;
  }

  // sum of divisors
  public static int getSumOfDivisors(int num) {
    int sum = 0;
    for (int i = 1; i < num; i++) {
      if (num % i == 0) {
        sum += i;
      }
    }
    return sum;
  }

  // get factorials
  public static int getFactorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact *= i;
    }
    return fact;
  }

  // Check if number is palindrome
  public static boolean isPalindrome(int num, int reverse) {
    if (num == reverse) {
      return true;
    } else {
      return false;
    }
  }

  // check for prime
  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  // check ofr neon
  public static boolean isNeon(int num) {
    int og = num;
    num = num * num;
    int count = countDigits(num);
    int[] digits = getDigits(num, count);
    int sum = sumOfDigits(digits);
    if (sum == og) {
      return true;
    } else {
      return false;
    }
  }

  // check fir spy
  public static boolean isSpy(int sum, int product) {
    if (sum == product) {
      return true;
    } else {
      return false;
    }
  }

  // check for Automorphic
  public static boolean isAutomorphic(int digit, int num) {
    num = num * num;
    int lastDigit = num % 10;
    if (lastDigit == digit) {
      return true;
    } else {
      return false;
    }
  }

  // check for Buzz
  public static boolean isBuzz(int num, int digit) {
    if (digit == 7 || num % 10 == 0) {
      return true;
    } else {
      return false;
    }
  }

  // check for Perfect
  public static boolean isPerfect(int num) {
    if (num <= 1)
      return false;
    int sum = 0;
    for (int i = 1; i < num; i++) {
      if (num % i == 0) {
        sum += i;
      }
    }
    return sum == num;
  }

  // is for Abundant
  public static boolean isAbundant(int num, int sum) {
    return sum > num;
  }

  // check for Deficient
  public static boolean isDeficient(int num, int sum) {
    return sum < num;
  }

  // check for Strong
  public static boolean isStrong(int num, int[] digits) {
    int sum = 0;
    for (int i : digits) {
      sum += getFactorial(i);
    }
    return sum == num;
  }

  // count the gactors
  public static int getFactorCount(int num) {
    int count = 0;
    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        count++;
      }
    }
    return count;
  }

  // get the factors
  public static int[] getFactors(int num, int count) {
    int[] factors = new int[count];
    int index = 0;
    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        factors[index] = i;
        index++;
      }
    }
    return factors;
  }

  // get the largest factors
  public static int getLargetFactor(int[] factors) {
    int largest = Integer.MIN_VALUE;
    for (int i : factors) {
      if (i > largest) {
        largest = i;
      }
    }
    return largest;
  }

  // get sum of factors
  public static int sumOfFactors(int[] factors) {
    int sum = 0;
    for (int i : factors) {
      sum += i;
    }
    return sum;
  }

  // get product of factors
  public static long productOfFactors(int[] factors) {
    int product = 1;
    for (int i : factors) {
      product *= i;
    }
    return product;
  }

  // gte cube of factors
  public static long productOfFactorsCube(int[] factors) {
    int product = 1;
    for (int i : factors) {
      product *= Math.pow(i, 3);
    }
    return product;
  }

  // UI Elements

  public static void printHeader(String title) {
    System.out.println(CYAN + "╔════════════════════════════════════╗");
    System.out.println("║ " + YELLOW + String.format("%-34s", title) + CYAN + " ║");
    System.out.println("╚════════════════════════════════════╝" + RESET);
  }

  public static void printProperty(String property, String value) {
    int width = Math.max(value.length(), 8);
    System.out.printf(PURPLE + "│ %-25s │ " + GREEN + "%-" + width + "s " + PURPLE + "│%n",
        property, value);
  }

  public static void printHeaderLine() {
    System.out.println(PURPLE + "┌───────────────────────────┬──────────┐");
  }

  public static void printDivider() {
    System.out.println(PURPLE + "├───────────────────────────┼──────────┤");
  }

  public static void printFooter() {
    System.out.println(PURPLE + "└───────────────────────────┴──────────┘" + RESET);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Get input
    System.out.print(CYAN + "Enter a numbr: " + YELLOW);
    int num = input.nextInt();
    if (num < 0)
      num = Math.abs(num);

    // Calculate properties
    int count = countDigits(num);
    int[] digits = getDigits(num, count);
    boolean isDuck = duckCheck(digits);
    boolean isArmstrong = armstrongCheck(digits, num);
    int[] largest = largerDigit(digits);
    int[] smallest = smallerDigit(digits);
    int squareSum = sumOfSquares(digits);
    int digitSum = sumOfDigits(digits);
    int product = productOfDigits(digits);
    int sumOfDivisors = getSumOfDivisors(num);
    boolean isHarshad = harshadCheck(num, digitSum);
    boolean isPalin = isPalindrome(num, getReverse(num));
    boolean isPrime = isPrime(num);
    boolean isNeon = isNeon(num);
    boolean isSpy = isSpy(digitSum, product);
    boolean isAutomorphic = isAutomorphic(digits[count - 1], num);
    boolean isPerfect = isPerfect(num);
    boolean isAbundant = isAbundant(num, sumOfDivisors);
    boolean isBuzz = isBuzz(num, digits[count - 1]);
    boolean isDeficient = isDeficient(num, sumOfDivisors);
    boolean isStrong = isStrong(num, digits);
    int countFactors = getFactorCount(num);
    int[] factors = getFactors(num, countFactors);
    int largestFactor = getLargetFactor(factors);
    int factorSum = sumOfFactors(factors);
    long factorProduct = productOfFactors(factors);
    long factorProductCube = productOfFactorsCube(factors);

    // Print results
    System.out.println();
    printHeader("NUMBER ANALYSIS REPORT");

    printHeaderLine();
    printProperty("Original Number", String.valueOf(num));
    printProperty("Reversed Number", String.valueOf(getReverse(num)));
    printProperty("Digit Count", String.valueOf(count));
    printProperty("Digits", Arrays.toString(digits));
    printProperty("Largest Digit", String.valueOf(largest[0]));
    printProperty("2nd Largest", String.valueOf(largest[1]));
    printProperty("Smallest Digit", String.valueOf(smallest[0]));
    printProperty("2nd Smallest", String.valueOf(smallest[1]));
    printProperty("Sum of Digits", String.valueOf(digitSum));
    printProperty("Product of Digits", String.valueOf(product));
    printProperty("Sum of Squares", String.valueOf(squareSum));
    printFooter();

    // number checks table
    System.out.println();
    printHeader("NUMBER CHECKS");
    printHeaderLine();
    printProperty("Duck Number", isDuck ? YES : NO);
    printProperty("Armstrong Number", isArmstrong ? YES : NO);
    printProperty("Palindrome", isPalin ? YES : NO);
    printProperty("Harshad Number", isHarshad ? YES : NO);
    printProperty("Prime Number", isPrime ? YES : NO);
    printProperty("Neon Number", isNeon ? YES : NO);
    printProperty("Spy Number", isSpy ? YES : NO);
    printProperty("Automorphic Number", isAutomorphic ? YES : NO);
    printProperty("Buzz Number", isBuzz ? YES : NO);
    printProperty("Perfect Number", isPerfect ? YES : NO);
    printProperty("Abundant Number", isAbundant ? YES : NO);
    printProperty("Deficient Number", isDeficient ? YES : NO);
    printProperty("Strong Number", isStrong ? YES : NO);
    printFooter();

    // Frequency table
    System.out.println();
    printHeader("DIGIT FREQUENCY");
    digitFrequency(digits, true);

    // Factor table
    System.out.println();
    printHeader("FACTOR ANALYSIS");
    printHeaderLine();
    printProperty("No. of factors", String.valueOf(countFactors));
    printProperty("Factors", String.valueOf(Arrays.toString(factors)));
    printProperty("Largest Factor", String.valueOf(largestFactor));
    printProperty("Sum of Factors", String.valueOf(factorSum));
    printProperty("Product of Factors", String.valueOf(factorProduct));
    printProperty("Product of Factor's cube", String.valueOf(factorProductCube));
    printFooter();

    input.close();
  }
}
