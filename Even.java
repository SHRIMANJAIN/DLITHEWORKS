import java.util.Scanner;
public class Even {
    public static boolean printEven(int e){
        return(e%2==0);
    }
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the value for x: ");
    int x = scanner.nextInt();
    System.err.println(printEven(x));

}
}
