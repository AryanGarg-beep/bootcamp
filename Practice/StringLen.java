import java.util.Scanner;

public class StringLen {

    public static int length(String str){
        int count = 0;
        try {
            while (true) {
                char c = str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.println("Length of the string: " + length(str));
        input.close();
    }
}