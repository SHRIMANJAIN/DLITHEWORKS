import java.util.*;
public class cp06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SIZE");
        int N = sc.nextInt();
        int arr[] = new int [N];
        System.out.println("ELEMENT");
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        //int SpikeSize = sc.nextInt();
        System.out.println(CoronaVirus(N,arr));
    }
    public static String[] CoronaVirus(int N,int arr[]){
        String[] arr1 = new String[N];
        for(int i=0;i<N;i++){
            arr1[i] = Integer.toBinaryString(arr[i]);
            
        }
        return arr1;
    }
    
}
