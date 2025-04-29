import java.util.Scanner;

public class RockPaperScissors {
  // ANSI color codes
  public static final String RESET = "\u001B[0m";
  public static final String RED = "\u001B[31m";
  public static final String GREEN = "\u001B[32m";
  public static final String YELLOW = "\u001B[33m";
  public static final String BLUE = "\u001B[34m";
  public static final String PURPLE = "\u001B[35m";
  public static final String CYAN = "\u001B[36m";

  // Box-drawing characters
  public static void printHeaderLine() {
    System.out.println(PURPLE + "┌─────────┬──────────┬──────────┬──────────┐" + RESET);
  }

  public static void printDivider() {
    System.out.println(PURPLE + "├─────────┼──────────┼──────────┼──────────┤" + RESET);
  }

  public static void printFooter() {
    System.out.println(PURPLE + "└─────────┴──────────┴──────────┴──────────┘" + RESET);
  }

  public static int computer() {
    return (int) (Math.random() * 3);
  }

  public static String getChoiceName(int choice) {
    switch (choice) {
      case 0:
        return BLUE + "Rock" + RESET;
      case 1:
        return GREEN + "Paper" + RESET;
      case 2:
        return RED + "Scissors" + RESET;
      default:
        return "Invalid";
    }
  }

  // Get raw choice name without color
  public static String getRawChoiceName(int choice) {
    switch (choice) {
      case 0:
        return "Rock";
      case 1:
        return "Paper";
      case 2:
        return "Scissors";
      default:
        return "Invalid";
    }
  }

  // Color the padded choice
  public static String colorChoice(int choice, String padded) {
    switch (choice) {
      case 0:
        return BLUE + padded + RESET;
      case 1:
        return GREEN + padded + RESET;
      case 2:
        return RED + padded + RESET;
      default:
        return padded;
    }
  }

  // Color the winner text
  public static String colorWinner(String originalWinner, String padded) {
    if (originalWinner.contains("Player")) {
      return CYAN + padded + RESET;
    } else if (originalWinner.contains("Computer")) {
      return PURPLE + padded + RESET;
    } else {
      return YELLOW + padded + RESET;
    }
  }

  public static String determineWinner(int c, int p) {
    if (c == p) {
      return YELLOW + "Draw" + RESET;
    } else if ((c == 0 && p == 2) || (c == 1 && p == 0) || (c == 2 && p == 1)) {
      return PURPLE + "Computer" + RESET;
    } else {
      return CYAN + "Player" + RESET;
    }
  }

  public static void displayResults(int[] playerChoices, int[] computerChoices,
      String[] winners, int totalGames) {

    System.out.println("\n" + CYAN + "Results Table:" + RESET);
    printHeaderLine();

    // Header row
    System.out.println(PURPLE + "│" + RESET + " Game #  " + PURPLE + "│" + RESET + " Player   " +
        PURPLE + "│" + RESET + " Computer " + PURPLE + "│" + RESET + " Winner   " + PURPLE + "│" + RESET);
    printDivider();

    for (int i = 0; i < totalGames; i++) {
      String gameNum = String.format("%-7d", i + 1);

      String rawPlayer = getRawChoiceName(playerChoices[i]);
      String rawComputer = getRawChoiceName(computerChoices[i]);
      String rawWinner = winners[i].replaceAll("\u001B\\[[;\\d]*m", ""); // strip colors

      String player = String.format("%-8s", rawPlayer);
      String computer = String.format("%-8s", rawComputer);
      String winner = String.format("%-9s", rawWinner);

      player = colorChoice(playerChoices[i], player);
      computer = colorChoice(computerChoices[i], computer);
      winner = colorWinner(winners[i], winner);

      System.out.println(PURPLE + "│" + RESET + " " + gameNum + " " +
          PURPLE + "│" + RESET + " " + player + " " +
          PURPLE + "│" + RESET + " " + computer + " " +
          PURPLE + "│" + RESET + " " + winner + PURPLE + "│" + RESET);

      if (i < totalGames - 1) {
        printDivider();
      }
    }

    printFooter();

    // Statistics
    int playerWins = 0;
    int computerWins = 0;
    int draws = 0;

    for (String winner : winners) {
      if (winner.contains("Player")) {
        playerWins++;
      } else if (winner.contains("Computer")) {
        computerWins++;
      } else {
        draws++;
      }
    }

    System.out.println("\n" + CYAN + "Final Statistics:" + RESET);
    System.out.printf(GREEN + "Player wins: " + RESET + "%d (%.1f%%)\n",
        playerWins, (playerWins * 100.0 / totalGames));
    System.out.printf(PURPLE + "Computer wins: " + RESET + "%d (%.1f%%)\n",
        computerWins, (computerWins * 100.0 / totalGames));
    System.out.printf(YELLOW + "Draws: " + RESET + "%d (%.1f%%)\n",
        draws, (draws * 100.0 / totalGames));
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print(CYAN + "Enter number of games: " + RESET);
    int totalGames = input.nextInt();

    int[] playerChoices = new int[totalGames];
    int[] computerChoices = new int[totalGames];
    String[] winners = new String[totalGames];

    for (int i = 0; i < totalGames; i++) {
      System.out.print(YELLOW + "Enter Rock(0), Paper(1) or Scissors(2) for game " +
          (i + 1) + ": " + RESET);
      playerChoices[i] = input.nextInt();

      while (playerChoices[i] < 0 || playerChoices[i] > 2) {
        System.out.print(RED + "Invalid choice. Please enter 0, 1, or 2: " + RESET);
        playerChoices[i] = input.nextInt();
      }

      computerChoices[i] = computer();
      winners[i] = determineWinner(computerChoices[i], playerChoices[i]);
    }

    displayResults(playerChoices, computerChoices, winners, totalGames);
  }
}
