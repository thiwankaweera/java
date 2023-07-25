   import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int userNum;
        System.out.println("Enter the number of elements:");

        Scanner input = new Scanner(System.in);
        userNum = input.nextInt();

        int[] intArray = new int[userNum];

        for(int i = 0; i < userNum; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            intArray[i] = input.nextInt();
        }

        for(int j = 0; j < userNum; j++) {
            System.out.println("Element " + (j + 1) + ": " + intArray[j]);
        }
    }
}






