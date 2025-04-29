import java.util.Scanner;

public class WordLength2D {
  public static String[][] splitAndFindLength(String s) {

    int count = 1;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ' ') {
        count++;
      }
    }

    String[][] wordLengths = new String[count][2];
    int index = 0, start = 0;

    for (int i = 0; i <= s.length(); i++) {
      if (i == s.length() || s.charAt(i) == ' ') {
        String word = "";
        for (int j = start; j < i; j++) {
          word += s.charAt(j);
        }
        wordLengths[index][0] = word;
        wordLengths[index][1] = String.valueOf(word.length());
        index++;
        start = i + 1;
      }
    }
    return wordLengths;
  }

  public static void display2DArray(String[][] arr) {
    System.out.println("Word\tLength");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i][0] + "\t" + arr[i][1]);
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String s = input.nextLine();

    String[][] wordLengths = splitAndFindLength(s);
    display2DArray(wordLengths);
  }
}
