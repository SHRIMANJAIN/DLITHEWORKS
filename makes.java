import java.util.Scanner;
public class makes {
    public static boolean check(int a,int b){
        return((a+b==10)||(a ==10)||(b==10));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the value for x: ");
        int x = sc.nextInt();
    
    System.out.print("Enter the value for y: ");
        int y = sc.nextInt();
    
        System.out.println(check(x,y));
    
}
}
