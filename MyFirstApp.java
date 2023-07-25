import java.util.Scanner;

public class MyFirstApp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the rectangle: ");
        double height = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double area = height * width;

        System.out.println("The area of the rectangle is " + area);
    }
}
