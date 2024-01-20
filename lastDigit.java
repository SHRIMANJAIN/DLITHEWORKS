import java.util.Scanner;
public class lastDigit {
    public static boolean last(int a,int b){
        return(a%10==b%10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value for x: ");
        int x = scanner.nextInt();

        System.out.print("Enter the value for y: ");
        int y = scanner.nextInt();

        System.out.println(last(x,y));


}
}