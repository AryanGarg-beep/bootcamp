import java.util.Scanner;

public class CharFrequency2D {

    public static String[][] findCharFrequency(String text) {
        int[] frequency = new int[256];
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        int count = 0;
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i); 
            if(frequency[ch] > 0 && ch != ' '){
                count++;
                frequency[ch] = 0; 
            }
        }

        String[][] result = new String[count][2];
        int index = 0;
        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            int ascii = (int)ch;
            if (frequency[ascii] == 0 && ch != ' ') {
                int charCount = 0;
                for(int j = 0; j < text.length(); j++){
                    if(text.charAt(j) == ch) charCount++;
                }
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(charCount);
                frequency[ascii] = -1; 
                index++;
            }
        }
        return result;
    }

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String[][] frequencies = findCharFrequency(text);

        System.out.println("Char frequencies: ");
        for (String[] freq : frequencies) {
            System.out.println(freq[0] + " : " + freq[1]);
        }     
    }   
}