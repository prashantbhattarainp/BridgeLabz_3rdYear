import java.util.Scanner;

public class RockPaperScissors {

    // Method to get computer choice
    static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "Rock";
        else if (choice == 1) return "Paper";
        else return "Scissors";
    }

    // Method to decide winner
    static String findWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "Draw";
        } else if ((user.equals("Rock") && computer.equals("Scissors")) ||
                   (user.equals("Paper") && computer.equals("Rock")) ||
                   (user.equals("Scissors") && computer.equals("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    // Method to calculate stats (win counts and percentages)
    static String[][] calculateStats(int userWins, int compWins, int games) {
        String[][] stats = new String[2][3]; // {Player/Computer, Wins, %}

        double userPercent = (userWins * 100.0) / games;
        double compPercent = (compWins * 100.0) / games;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercent) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f", compPercent) + "%";

        return stats;
    }

    // Method to display game results
    static void displayResults(String[][] games, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tUser\t\tComputer\tWinner");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < games.length; i++) {
            System.out.println((i + 1) + "\t" + games[i][0] + "\t\t" + games[i][1] + "\t\t" + games[i][2]);
        }

        System.out.println("\nStatistics:");
        System.out.println("Player\tWins\tWin %");
        System.out.println("---------------------------");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[][] games = new String[n][3];
        int userWins = 0, compWins = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter your choice (Rock, Paper, Scissors): ");
            String user = sc.nextLine().trim();

            String comp = getComputerChoice();
            String winner = findWinner(user, comp);

            games[i][0] = user;
            games[i][1] = comp;
            games[i][2] = winner;

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
        }

        String[][] stats = calculateStats(userWins, compWins, n);
        displayResults(games, stats);
    }
}
