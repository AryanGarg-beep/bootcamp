import java.util.Scanner;

public class VowelConsonantChecker {
  public static String checkCharacterType(char c) {
    if (c >= 'A' && c <= 'Z') {
      c = (char) (c + 32);
    }

    if (Character.isLetter(c)) {
      if ("aeiou".indexOf(c) != -1) {
        return "Vowel";
      } else {
        return "Consonant";
      }
    }
    return "Not a Letter";
  }

  public static String[][] findVowelsAndConsonants(String s) {
    String[][] result = new String[s.length()][2];
    int index = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      String type = checkCharacterType(c);
      result[index][0] = String.valueOf(c);
      result[index][1] = type;
      index++;
    }
    return result;
  }

  public static void display2DArray(String[][] array) {
    System.out.println("Character  | Type");
    for (int i = 0; i < array.length; i++) {
      System.out.printf("%-10s | %s\n", array[i][0], array[i][1]);
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String s = input.nextLine();

    String[][] result = findVowelsAndConsonants(s);
    display2DArray(result);
  }
}
