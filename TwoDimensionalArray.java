import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // Prompt the user for the number of rows and columns
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int numCols = scanner.nextInt();

        // Create a two-dimensional array of size numRows x numCols
        int[][] arr = new int[numRows][numCols];

        // Loop over each element in the array, calculating the product of its indices
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                arr[i][j] = i * j;
            }
        }

        // Print the resulting array
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(arr[i][j]);
                if (j < numCols-1) {
                    System.out.print("\t"); // Use a tab character to separate columns
                }
            }
            System.out.print("\n"); // Use a newline character to separate rows
        }
    }
}
