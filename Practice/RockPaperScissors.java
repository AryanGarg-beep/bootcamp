import java.util.Scanner;

public class RockPaperScissors {

    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        switch (choice) {
            case 0: return "rock";
            case 1: return "paper";
            default: return "scissors";
        }
    }


    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "Player";
        }
        return "Computer";
    }

    
    public static String[][] getStats(int playerWins, int computerWins, int draws, int totalGames) {
        String[][] stats = new String[2][3];
        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f%%", (playerWins * 100.0) / totalGames);
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f%%", (computerWins * 100.0) / totalGames);
        
        return stats;
    }

    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\nGame\tPlayer\tComputer\tWinner");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i+1) + "\t" + gameResults[i][0] + "\t" + gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }
        System.out.println("\nStats:");
        System.out.println("Player Wins: " + stats[0][1] + " (" + stats[0][2] + ")");
        System.out.println("Computer Wins: " + stats[1][1] + " (" + stats[1][2] + ")");
    }

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        String[][] gameResults = new String[n][3];
        int playerWins = 0, computerWins = 0, draws = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("\nGame " + (i+1) + " - Enter your choice (rock/paper/scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();
            while (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.print("Invalid choice. Enter rock, paper, or scissors: ");
                userChoice = scanner.nextLine().toLowerCase();
            }
            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;

            if (winner.equals("Player")) playerWins++;
            else if (winner.equals("Computer")) computerWins++;
            else draws++;
        }

        String[][] stats = getStats(playerWins, computerWins, draws, n);
        displayResults(gameResults, stats);

        System.out.println("Draws: " + draws + " (" + String.format("%.2f%%", (draws * 100.0) / n) + ")");
    }
}