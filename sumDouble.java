import java.util.Scanner;
public class sumDouble {
    public static int add(int a,int b){
        return(a==b)?((a+b)*2):(a+b);
    }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter the value for x: ");
        int x = sc.nextInt();

        System.out.print("Enter the value for y: ");
        int y = sc.nextInt();

        System.out.println(add(x,y));

}
}
