import java.util.Scanner;

public class GreenLotteryTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter the value for a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value for b: ");
        int b = scanner.nextInt();

        System.out.print("Enter the value for c: ");
        int c = scanner.nextInt();

        int result = greenTicket(a, b, c);
        System.out.println("Result for the green lottery ticket: " + result);

        // Close the scanner
        scanner.close();
    }

    public static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || b == c || a == c) {
            return 10;
        } else {
            return 0;
        }
    }
}

    

