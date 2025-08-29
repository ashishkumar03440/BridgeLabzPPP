package Strings_Level2;

import java.util.Scanner;

public class RockPaperScissorsGame {
    // Method to get computer choice
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3); // 0,1,2
        switch (choice) {
            case 0: return "Rock";
            case 1: return "Paper";
            case 2: return "Scissors";
        }
        return "Rock"; // default
    }

    // Method to find winner
    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "Draw";
        }
        switch (user) {
            case "Rock":
                return (computer.equals("Scissors")) ? "User" : "Computer";
            case "Paper":
                return (computer.equals("Rock")) ? "User" : "Computer";
            case "Scissors":
                return (computer.equals("Paper")) ? "User" : "Computer";
        }
        return "Invalid";
    }

    // Method to calculate stats
    public static String[][] calculateStats(int userWins, int computerWins, int draws, int totalGames) {
        String[][] stats = new String[2][3];

        double userPercent = (userWins * 100.0) / totalGames;
        double compPercent = (computerWins * 100.0) / totalGames;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercent) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", compPercent) + "%";

        return stats;
    }

    // Method to display results
    public static void displayResults(String[][] results, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tUser Choice\tComputer Choice\tWinner");
        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t\t" + results[i][1] + "\t\t" + results[i][2]);
        }

        System.out.println("\nFinal Stats:");
        System.out.println("Player\tWins\tWinning %");
        System.out.println("--------------------------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[][] results = new String[n][3];
        int userWins = 0, computerWins = 0, draws = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("\nGame " + (i + 1) + " - Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = sc.nextLine().trim();
            String computerChoice = getComputerChoice();

            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
            else draws++;

            results[i][0] = userChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, computerWins, draws, n);
        displayResults(results, stats);

        sc.close();
    }
}
