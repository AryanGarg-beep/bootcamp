import java.util.Scanner;

public class ShortestLongestString {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    String[] words = s.split(" ");

    String shortest = words[0], longest = words[0];
    for (String word : words) {
      if (word.length() < shortest.length()) {
        shortest = word;
      }
      if (word.length() > longest.length()) {
        longest = word;
      }
    }

    System.out.println("Shortest: " + shortest);
    System.out.println("Longest: " + longest);
  }
}
