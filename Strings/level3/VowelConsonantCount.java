import java.util.Scanner;

public class VowelConsonantCount {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter String: ");
    String s = input.nextLine();
    int vowels = 0, consonants = 0;

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (Character.isLetter(c)) {
        c = Character.toLowerCase(c);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
          vowels++;
        } else {
          consonants++;
        }
      }
    }
    System.out.println("vowels: " + vowels + "\nonsonants: " + consonants);
  }
}
