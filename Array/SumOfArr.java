import java.util.*;
import java.util.Scanner;

public class SumOfArr{
    public static void sumofsubarr(int arr[]){
        int n = arr.length;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            int s = i;  
      
            for(int j =i;j<n;j++){
                int e = j;
               int cursum = 0;
               for(int k =s;k<= e;k++){
                    cursum = cursum + arr[k];
               }
               System.out.println(cursum);
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