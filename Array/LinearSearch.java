import java.util.*;
import java.util.Scanner;
public class LinearSearch{
   
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of arr");
        int n = in.nextInt();
        System.out.println("Enter the ele of arr");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the key ele of arr");
         int k = in.nextInt();
         if
         for(int i =0;i<n;i++){
            if(arr[i]==k){
                System.out.println("Enter  ele is " + k +" present at index " + (i+1));

            }
         }
        
                System.out.println("Enter the ele is " + k +" not present");
           
    }
}