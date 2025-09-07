import java.util.Scanner;

public class TextFormatter {
    static Scanner input = new Scanner(System.in);

    public static String[] splitWords(String text) {
        int n = text.length();
        StringBuilder word = new StringBuilder();
        java.util.List<String> words = new java.util.ArrayList<>();
        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                if (word.length() > 0) {
                    words.add(word.toString());
                    word.setLength(0);
                }
            } else {
                word.append(c);
            }
        }
        if (word.length() > 0) words.add(word.toString());
        return words.toArray(new String[0]);
    }

    public static String justify(String[] words, int width) {
        StringBuilder result = new StringBuilder();
        java.util.List<String> line = new java.util.ArrayList<>();
        int lineLen = 0;
        for (String word : words) {
            if (lineLen + word.length() + line.size() > width) {
                int spaces = width - lineLen;
                int gaps = line.size() - 1;
                if (gaps == 0) result.append(line.get(0));
                else {
                    int even = spaces / gaps;
                    int extra = spaces % gaps;
                    for (int i = 0; i < gaps; i++) {
                        result.append(line.get(i));
                        for (int j = 0; j < even; j++) result.append(" ");
                        if (i < extra) result.append(" ");
                    }
                    result.append(line.get(gaps));
                }
                result.append("\n");
                line.clear();
                lineLen = 0;
            }
            line.add(word);
            lineLen += word.length();
        }
        for (int i = 0; i < line.size(); i++) {
            result.append(line.get(i));
            if (i < line.size() - 1) result.append(" ");
        }
        return result.toString();
    }

    public static String center(String[] words, int width) {
        StringBuilder result = new StringBuilder();
        StringBuilder line = new StringBuilder();
        for (String word : words) {
            if (line.length() + word.length() + 1 > width) {
                int padding = (width - line.length()) / 2;
                for (int i = 0; i < padding; i++) result.append(" ");
                result.append(line.toString()).append("\n");
                line.setLength(0);
            }
            if (line.length() > 0) line.append(" ");
            line.append(word);
        }
        int padding = (width - line.length()) / 2;
        for (int i = 0; i < padding; i++) result.append(" ");
        result.append(line.toString());
        return result.toString();
    }

    public static void compare(String[] words, int width) {
        long t1 = System.nanoTime();
        justify(words, width);
        long t2 = System.nanoTime();
        String concatResult = "";
        java.util.List<String> line = new java.util.ArrayList<>();
        int lineLen = 0;
        for (String word : words) {
            if (lineLen + word.length() + line.size() > width) {
                concatResult += String.join(" ", line) + "\n";
                line.clear();
                lineLen = 0;
            }
            line.add(word);
            lineLen += word.length();
        }
        concatResult += String.join(" ", line);
        long t3 = System.nanoTime();
        System.out.println("StringBuilder time: " + (t2 - t1) + " ns");
        System.out.println("String concatenation time: " + (t3 - t2) + " ns");
    }

    public static void display(String text, String[] words, int width) {
        System.out.println("Original Text:\n" + text + "\n");
        String justified = justify(words, width);
        System.out.println("Left-Justified Text:");
        String[] lines = justified.split("\n");
        for (int i = 0; i < lines.length; i++) {
            System.out.println((i + 1) + ": " + lines[i] + " (" + lines[i].length() + ")");
        }
        System.out.println("\nCenter-Aligned Text:");
        String centered = center(words, width);
        String[] clines = centered.split("\n");
        for (int i = 0; i < clines.length; i++) {
            System.out.println((i + 1) + ": " + clines[i] + " (" + clines[i].length() + ")");
        }
        System.out.println();
        compare(words, width);
    }

    public static void main(String[] args) {
        System.out.println("Enter text:");
        String text = input.nextLine();
        System.out.println("Enter line width:");
        int width = input.nextInt();
        String[] words = splitWords(text);
        display(text, words, width);
    }
}
