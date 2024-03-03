import java.util.Scanner;
import tools.*;
class Assignment9_1{
    public static int[] leader(int[] arr, int n) {
        int[] leaders = new int[n];
        int count = 0;
        int maxFromRight = arr[n - 1];
        leaders[count++] = maxFromRight;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                leaders[count++] = maxFromRight;
            }
        }

        int[] result = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            result[count - 1 - i] = leaders[i];
        }

        return result;
    }
    public static void main(String args[]){
        Scanner ab = new Scanner(System.in);
        int n = ab.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = ab.nextInt();
        }
        int[] ans = leader(a,a.length);
        System.out.println("The leader elements are : ");
        ArrayMethod.printArray(ans);
        ab.close();
    }
}