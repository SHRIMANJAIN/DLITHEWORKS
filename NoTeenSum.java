import java.util.Scanner;

public class NoTeenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter the value for a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value for b: ");
        int b = scanner.nextInt();

        System.out.print("Enter the value for c: ");
        int c = scanner.nextInt();

        int result = noTeenSum(a, b, c);
        System.out.println("Sum without counting teens: " + result);

        // Close the scanner
        scanner.close();
    }

    public static int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public static int fixTeen(int n) {
        if ((n >= 13 && n <= 14) || (n >= 17 && n <= 19)) {
            return 0;
        } else {
            return n;
        }
    }
}

    

