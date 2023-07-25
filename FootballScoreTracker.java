import java.util.Scanner;

public class FootballScoreTracker {
    public static void main(String[] args) {
        final int NUM_PLAYERS = 3;
        final int NUM_WEEKS = 5;
        String[] players = {"Mohamed Salah", "Harry Kane", "Lionel Messi"};
        int[][] goals = new int[NUM_PLAYERS][NUM_WEEKS];
        
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter the number of goals scored by each player for each week
        for (int i = 0; i < NUM_WEEKS; i++) {
            System.out.println("Enter the number of goals scored in week " + (i+1) + ":");
            for (int j = 0; j < NUM_PLAYERS; j++) {
                System.out.print(players[j] + ": ");
                goals[j][i] = input.nextInt();
            }
        }
        
        // Display total number of goals scored by each player
        System.out.println("\nTotal goals scored by each player:");
        for (int i = 0; i < NUM_PLAYERS; i++) {
            int totalGoals = 0;
            for (int j = 0; j < NUM_WEEKS; j++) {
                totalGoals += goals[i][j];
            }
            System.out.println(players[i] + ": " + totalGoals);
        }
        
        // Display average number of goals scored by each player
        System.out.println("\nAverage goals scored by each player:");
        for (int i = 0; i < NUM_PLAYERS; i++) {
            int totalGoals = 0;
            for (int j = 0; j < NUM_WEEKS; j++) {
                totalGoals += goals[i][j];
            }
            double avgGoals = (double) totalGoals / NUM_WEEKS;
            System.out.println(players[i] + ": " + avgGoals);
        }
        
        // Display player who scored the most number of goals
        int maxGoals = 0;
        String topScorer = "";
        for (int i = 0; i < NUM_PLAYERS; i++) {
            int totalGoals = 0;
            for (int j = 0; j < NUM_WEEKS; j++) {
                totalGoals += goals[i][j];
            }
            if (totalGoals > maxGoals) {
                maxGoals = totalGoals;
                topScorer = players[i];
            }
        }
        System.out.println("\nThe top scorer is " + topScorer + " with " + maxGoals + " goals.");
    }
}
c