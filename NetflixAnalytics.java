import java.util.Scanner;

public class NetflixAnalytics {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Keep track of views for each episode
        int[][] views = new int[3][];
        views[0] = new int[10]; // Drive to Survive, season 4
        views[1] = new int[9]; // Inventing Anna
        views[2] = new int[8]; // Bridgerton, season 2
        
        // Prompt user to enter views for each episode
        for (int i = 0; i < views.length; i++) {
            for (int j = 0; j < views[i].length; j++) {
                System.out.print("Enter views for episode " + (j+1) + " of series " + (i+1) + ": ");
                int numViews = input.nextInt();
                if (numViews >= 100000) {
                    views[i][j] = numViews;
                } else {
                    views[i][j] = 1;
                }
            }
        }
        
        // Menu options
        int choice = 0;
        while (choice != 5) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Display average number of views for each series season");
            System.out.println("2. Display the episode from all series with the highest number of views");
            System.out.println("3. Display the most popular series");
            System.out.println("4. Display the show that had the largest audience for its season finale");
            System.out.println("5. Exit");
            choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    displayAverageViews(views);
                    break;
                case 2:
                    displayHighestEpisode(views);
                    break;
                case 3:
                    displayMostPopularSeries(views);
                    break;
                case 4:
                    displayLargestFinale(views);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }
    
    // Display average number of views for each series season
    public static void displayAverageViews(int[][] views) {
        double[] averages = new double[3];
        for (int i = 0; i < views.length; i++) {
            int sum = 0;
            for (int j = 0; j < views[i].length; j++) {
                sum += views[i][j];
            }
            averages[i] = (double) sum / views[i].length;
        }
        System.out.println("\nAverage views per episode:");
        System.out.println("Drive to Survive, season 4: " + averages[0]);
        System.out.println("Inventing Anna: " + averages[1]);
        System.out.println("Bridgerton, season 2: " + averages[2]);
    }
    
    // Display the episode from all series with the highest number of views
    public static void displayHighestEpisode(int[][] views) {
        int maxViews = 0;
        int seriesIndex = 0;
        int episodeIndex = 0;
        for (int i = 0; i < views.length; i++) {
            for (int j = 0; j < views[i].length; j++) {
                if (views[i][j] > maxViews) {
                    maxViews = views[i][j];
                    seriesIndex = i;
                    episodeIndex = j;
                }
            }
        }
        
import java.util.Scanner;

public class NetflixAnalytics {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Keep track of views for each episode
        int[][] views = new int[3][];
        views[0] = new int[10]; // Drive to Survive, season 4
        views[1] = new int[9]; // Inventing Anna
        views[2] = new int[8]; // Bridgerton, season 2
        
        // Prompt user to enter views for each episode
        for (int i = 0; i < views.length; i++) {
            for (int j = 0; j < views[i].length; j++) {
                System.out.print("Enter views for episode " + (j+1) + " of series " + (i+1) + ": ");
                int numViews = input.nextInt();
                if (numViews >= 100000) {
                    views[i][j] = numViews;
                } else {
                    views[i][j] = 1;
                }
            }
        }
        
        // Menu options
        int choice = 0;
        while (choice != 5) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Display average number of views for each series season");
            System.out.println("2. Display the episode from all series with the highest number of views");
            System.out.println("3. Display the most popular series");
            System.out.println("4. Display the show that had the largest audience for its season finale");
            System.out.println("5. Exit");
            choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    displayAverageViews(views);
                    break;
                case 2:
                    displayHighestEpisode(views);
                    break;
                case 3:
                    displayMostPopularSeries(views);
                    break;
                case 4:
                    displayLargestFinale(views);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }
    
    // Display average number of views for each series season
    public static void displayAverageViews(int[][] views) {
        double[] averages = new double[3];
        for (int i = 0; i < views.length; i++) {
            int sum = 0;
            for (int j = 0; j < views[i].length; j++) {
                sum += views[i][j];
            }
            averages[i] = (double) sum / views[i].length;
        }
        System.out.println("\nAverage views per episode:");
        System.out.println("Drive to Survive, season 4: " + averages[0]);
        System.out.println("Inventing Anna: " + averages[1]);
        System.out.println("Bridgerton, season 2: " + averages[2]);
    }
    
    // Display the episode from all series with the highest number of views
    public static void displayHighestEpisode(int[][] views) {
        int maxViews = 0;
        int seriesIndex = 0;
        int episodeIndex = 0;
        for (int i = 0; i < views.length; i++) {
            for (int j = 0; j < views[i].length; j++) {
                if (views[i][j] > maxViews) {
                    maxViews = views[i][j];
                    seriesIndex = i;
                    episodeIndex = j;
                }
            }
        }
        String[]series
