import java.util.*;
public class cp05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(StringCalc(str));
    }
    public static int StringCalc(String str){
        int HashCount = 0,StarCount = 0, Output;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='#'){
                HashCount++;
            }
            if(str.charAt(i)=='*'){
                StarCount++;
            }
        }
        if(HashCount>StarCount){
            Output = HashCount - StarCount;
        }
        else if(StarCount>HashCount){
            Output = StarCount - HashCount;
        }
        else {      
            Output = 0;
        }

        return Output;
    }
    
}
