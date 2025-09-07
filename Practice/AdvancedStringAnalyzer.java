
import java.util.Scanner;
public class AdvancedStringAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== ADVANCED STRING ANALYZER ===");
        // TODO: Ask user for two strings to compare
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        // TODO: Perform comprehensive comparison analysis:
        // 1. Reference equality (==)
        // 2. Content equality (equals)
        // 3. Case-insensitive equality (equalsIgnoreCase)
        // 4. Lexicographic comparison (compareTo)
        // 5. Case-insensitive lexicographic comparison
        // 6. Similarity percentage calculation
        System.out.println("=== COMPARISION RESULTS ===");
        System.out.println("reference equality: " + (str1 == str2));
        System.out.println("content equality: " + str1.equals(str2));
        System.out.println("Case insensitive equality: " + str1.equalsIgnoreCase(str2));
        System.out.println("Lexicographic comparison: " + str1.compareTo(str2));
        System.out.println("lexicographic comparison (case-insensitive): " + str1.compareToIgnoreCase(str2));
        System.out.println("Similarity percentage: " + calculateSimilarity(str1, str2) + "%");
        // TODO: Performance analysis of different string operations
        scanner.close();
        System.out.println("=== PERFORMANCE ANALYSIS ===");
        System.out.println("Memory usage analysis:");
        analyzeMemoryUsage(str1, str2);
        System.out.println("Optimized string processing:");
        String[] inputs = {str1, str2, "Additional", "Strings"};
        String optimizedResult = optimizedStringProcessing(inputs);
        System.out.println("Optimized result: " + optimizedResult);
        System.out.println("Demonstrating string interning:");
        demonstrateStringIntern();
    }

    // TODO: Method to calculate string similarity percentage
    public static double calculateSimilarity(String str1, String str2) {
        // Use Levenshtein distance or similar algorithm
        // using levenshtein algorithm to calculate similarity
        int maxLength = Math.max(str1.length(), str2.length());
        if (maxLength == 0) return 100.0; // Both strings are empty
        int distance = levenshteinDistance(str1, str2);
        return (1 - (double) distance / maxLength) * 100;
    }

    // Levenshtein distance implementation
    public static int levenshteinDistance(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1],
                            Math.min(dp[i - 1][j], dp[i][j - 1]));
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }

    // TODO: Method to perform all comparison types
    public static void performAllComparisons(String str1, String str2) {
        // Your code here
        System.out.println("Reference equality: " + (str1 == str2));
        System.out.println("Content equality: " + str1.equals(str2));
        System.out.println("Case-insensitive equality: " + str1.equalsIgnoreCase(str2));
        System.out.println("Lexicographic comparison: " + str1.compareTo(str2));
        System.out.println("Case-insensitive lexicographic comparison: " + str1.compareToIgnoreCase(str2));
        System.out.println("Similarity percentage: " + calculateSimilarity(str1, str2) + "%");
    }

    // TODO: Method to analyze string memory usage
    public static void analyzeMemoryUsage(String... strings) {
        // Approximate memory analysis
        long totalMemory = 0;
        for (String str : strings) {
            totalMemory += str.length() * Character.BYTES; // Approximate memory usage
        }
        System.out.println("Total memory usage for strings: " + totalMemory + " bytes");
    }

    // TODO: Method to optimize string operations
    public static String optimizedStringProcessing(String[] inputs) {
        // Use StringBuilder for efficient processing
        // Your code here
        StringBuilder sb = new StringBuilder();
        for (String input : inputs) {
            sb.append(input.trim()).append(" ");
        }
        return sb.toString().trim();
    }

    // TODO: Method to demonstrate intern() method
    public static void demonstrateStringIntern() {
        // Show string pool behavior with intern()
        // Your code here
        String str1 = new String("Hello").intern();
        String str2 = new String("Hello").intern();
        System.out.println("str1 and str2 reference equality: " + (str1 == str2)); // Should be true
        System.out.println("str1 content equality: " + str1.equals(str2)); // Should be true
    }
}