import java.util.*;
import java.util.Scanner;
public class LongestSubarray{

    public static int longestsubarray(int arr[],int n){
        // int len=0;
        
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         int s =0;
        //         for(int k=i;k<=j;k++){
        //             s = s + arr[k];
        //             if(s==k){
        //                 len = Math.max(len,j-i+1);
        //             }
        //         }
        //     }
        // }

         int len=0;
        
        for(int i=0;i<n;i++){
            int s =0;
            for(int j=i;j<n;j++){3q
                s=s+arr[j]
                
                    if(s==k){
                        len = Math.max(len,j-i+1);
                    }
                
            }
        }
        return len;
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of arr");
        int n = in.nextInt();
        System.out.println("Enter the ele of arr");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int len = longestsubarray(arr,n);
        System.out.println("length: "+len);



                  
    }
}