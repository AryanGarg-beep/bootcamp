import java.util.Scanner;

public class StringLength {
    public static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int customLength = findLength(s);
        int builtinLength = s.length();
        System.out.println("Custom Length: " + customLength);
        System.out.println("Built-in Length: " + builtinLength);
    }
}

