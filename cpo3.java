
import java.util.*;

public class cpo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MinCharge = 35, KmCharge = 10, WaitCharge = 1, LuggCharge = 5;

        System.out.println("ENTER TRAVEL DISTANCE (IN KM)");
        float TravelDist = sc.nextFloat();

        System.out.println("ENTER WAITING TIME (IN MINUTES)");
        int WaitTime = sc.nextInt();

        System.out.println("ENTER LUGGAGE WEIGHT (IN KG)");
        int LuggWeight = sc.nextInt();

        float FairPrice = FairPriceCalc(TravelDist, WaitTime, LuggWeight, MinCharge, KmCharge, WaitCharge, LuggCharge);
        System.out.println("TOTAL CHARGE: " + FairPrice);
    }

    public static float FairPriceCalc(float TravelDist, int WaitTime, int LuggWeight, int MinCharge, int KmCharge, int WaitCharge, int LuggCharge) {
        float totalCharge;
        if(TravelDist>1.6){
        totalCharge = (float) (MinCharge + (KmCharge * (TravelDist - 1.6)) + (WaitCharge * WaitTime) + (LuggCharge * (LuggWeight/5)));
        }
        else {
        totalCharge = (float) (MinCharge  + (WaitCharge * WaitTime) + (LuggCharge * (LuggWeight/5))); 
        }
        return totalCharge;
    }
}