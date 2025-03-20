import java.util.*;
import java.util.Scanner;

public class BetSumOfSubArr{
    public static void sumofsubarr(int arr[]){
        int n = arr.length;
        int maxsum = 0;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        System.out.print("Our prifix arr : ");
        for( int i=0;i<n;i++){
            System.out.print( prefix[i] + " ");
        }
        System.out.print("\n");
        for(int i = 0;i<n;i++){
            int s = i;  
      System.out.print("current sums for iteration  " + i + ": ");
            for(int j =i;j<n;j++){
                int e = j;
               int cursum = prefix[e];
               cursum = (s == 0) ? prefix[e] : prefix[e] - prefix[s-1];
               System.out.print(cursum + " ");
               if(cursum > maxsum){
                maxsum = cursum;
               }
            } 
            System.out.println();  
        }
        System.out.println("max sum is "+ maxsum);
    }


    public static void main(String args[]){
        // int arr[] = { 34, 12, 3 ,7 ,47};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of arr");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the ele of arr");
        
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
       sumofsubarr(arr);
       }
}