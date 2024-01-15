import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter the value for a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value for b: ");
        int b = scanner.nextInt();

        System.out.print("Enter the value for c: ");
        int c = scanner.nextInt();

        int result = sumWithout13(a, b, c);
        System.out.println("Sum without considering 13: " + result);

        // Close the scanner
        scanner.close();
    }

    public static int sumWithout13(int a, int b, int c) {
        if (a == 13) {
            return 0;
        } else if (b == 13) {
            return a;
        } else if (c == 13) {
            return a + b;
        } else {
            return a + b + c;
        }
    }
}
