import java.util.Scanner;
public class StringPerformanceComparison {
    public static void main(String[] args) {
        System.out.println("=== PERFORMANCE COMPARISON ===");

        // Test string concatenation with regular String (slow method)
        long startTime = System.nanoTime();
        String result1 = concatenateWithString(1000);
        long endTime = System.nanoTime();
        System.out.println("String concatenation time: " + (endTime - startTime) + " ns");

        // Test string concatenation with StringBuilder (fast method)
        startTime = System.nanoTime();
        String result2 = concatenateWithStringBuilder(1000);
        endTime = System.nanoTime();
        System.out.println("StringBuilder concatenation time: " + (endTime - startTime) + " ns");

        // Test string concatenation with StringBuffer (thread-safe method)
        startTime = System.nanoTime();
        String result3 = concatenateWithStringBuffer(1000);
        endTime = System.nanoTime();
        System.out.println("StringBuffer concatenation time: " + (endTime - startTime) + " ns");

        // Compare memory usage (approximate)
        System.out.println("Approximate memory usage (bytes):");
        System.out.println("String: " + (result1.length() * Character.BYTES));
        System.out.println("StringBuilder: " + (result2.length() * Character.BYTES));
        System.out.println("StringBuffer: " + (result3.length() * Character.BYTES));

        // Demonstrate StringBuilder methods
        demonstrateStringBuilderMethods();

        // Demonstrate thread safety differences
        demonstrateThreadSafety();

        // Compare string comparison methods
        compareStringComparisonMethods();

        // Demonstrate memory efficiency
        demonstrateMemoryEfficiency();
    }

    // Method using String concatenation (inefficient)
    public static String concatenateWithString(int iterations) {
        String result = "";
        for (int i = 0; i < iterations; i++) {
            result += "Java " + i + " ";
        }
        return result;
    }

    // Method using StringBuilder (efficient, not thread-safe)
    public static String concatenateWithStringBuilder(int iterations) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("Java ").append(i).append(" ");
        }
        return sb.toString();
    }

    // Method using StringBuffer (efficient, thread-safe)
    public static String concatenateWithStringBuffer(int iterations) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sb.append("Java ").append(i).append(" ");
        }
        return sb.toString();
    }

    // Method to demonstrate StringBuilder methods
    public static void demonstrateStringBuilderMethods() {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.append("!");
        sb.insert(5, ",");
        sb.delete(6, 11);
        sb.deleteCharAt(5);
        sb.reverse();
        sb.reverse(); // reverse back
        sb.replace(0, 2, "Hi");
        sb.setCharAt(2, '-');
        System.out.println("StringBuilder after modifications: " + sb.toString());
        System.out.println("Capacity: " + sb.capacity());
        sb.ensureCapacity(100);
        System.out.println("Capacity after ensureCapacity(100): " + sb.capacity());
        sb.trimToSize();
        System.out.println("Capacity after trimToSize(): " + sb.capacity());
    }

    // Method to demonstrate StringBuffer thread safety
    public static void demonstrateThreadSafety() {
        StringBuffer buffer = new StringBuffer();
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                buffer.append("A");
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("StringBuffer length after threads: " + buffer.length());
    }

    // Method to compare string comparison methods
    public static void compareStringComparisonMethods() {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println("Reference equality (str1 == str2): " + (str1 == str2));
        System.out.println("Content equality (str1.equals(str2)): " + str1.equals(str2));
        System.out.println("Case-insensitive equality (str1.equalsIgnoreCase(str3)): " + str1.equalsIgnoreCase(str3));
        System.out.println("Lexicographic comparison (str1.compareTo(str2)): " + str1.compareTo(str2));
        System.out.println("Case-insensitive lexicographic comparison (str1.compareToIgnoreCase(str3)): " + str1.compareToIgnoreCase(str3));
        System.out.println("Reference equality (str1 == str3): " + (str1 == str3));
        System.out.println("Content equality (str1.equals(str3)): " + str1.equals(str3));
    }

    // Method to demonstrate memory efficiency
    public static void demonstrateMemoryEfficiency() {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println("Memory usage of str1: " + (str1.length() * Character.BYTES) + " bytes");
        System.out.println("Memory usage of str2: " + (str2.length() * Character.BYTES) + " bytes");
        System.out.println("Memory usage of str3: " + (str3.length() * Character.BYTES) + " bytes");

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Initial capacity of StringBuilder: " + sb.capacity() + " characters");

        sb.append(" World");
        System.out.println("Capacity after appending: " + sb.capacity() + " characters");

        sb.ensureCapacity(100);
        System.out.println("Capacity after ensuring 100 characters: " + sb.capacity() + " characters");

        sb.trimToSize();
        System.out.println("Capacity after trimming to size: " + sb.capacity() + " characters");
    }
}