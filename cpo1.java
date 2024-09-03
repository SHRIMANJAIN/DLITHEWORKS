import java.util.*;

public class cpo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ab = sc.nextLine();
        StringBuilder sb = new StringBuilder(ab);
        for(int i=0;i<ab.length();i++){
            if(ab.charAt(i)=='a'){
                sb.setCharAt(i,'b');
            }
            if(ab.charAt(i)=='b'){
                sb.setCharAt(i, 'a');
            }
        }
        System.out.println(sb);
    }
}