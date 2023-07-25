import java.util.*;

class permulation {
    public static int factorial(int n) {
        int result = 1;
        for (int i = n; i > 0; i--) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, r;
        do {
            System.out.print("Enter n: ");
            n = sc.nextInt();
        } while ((n < 5) || (n > 50));

        do {
            System.out.print("Enter r: ");
            r = sc.nextInt();
        } while ((r < 2) || (r > (n - 1)));

        int[] outputArray = new int[r - 1];
        for (int i = 2; i <= r; i++) {
            outputArray[i - 2] = factorial(n) / (factorial(n - i + 1) * factorial(i - 2));
        }
        for (int i = 0; i < (r - 1); i++) {
            System.out.print(outputArray[i] + "\t");
        }
        System.out.print("\n");
    }
}

