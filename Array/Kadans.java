import java.util.*;
import java.util.Scanner;
public class Kadans{
    public static void kadans(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        int cursum = 0;
        int count = 0;
    
        for(int i = 0;i<arr.length;i++){
            if(arr[i]< 0){
                count++;
            }
        }
        if(count == arr.length){
         for(int i =0;i<arr.length;i++){
            maxsum = Math.max(maxsum,arr[i]);
         }
        }else{
        for(int i =0;i< arr.length;i++){
            cursum = cursum + arr[i];
            if(cursum < 0){
                cursum = 0;
            }
            maxsum = Math.max(cursum, maxsum);
        }
        }
       
        System.out.println("Our maxsum is " + maxsum);
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
       kadans(arr);
       }
    }