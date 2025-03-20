import java.util.*;
import java.util.Scanner;
public class Subarr{
    public static void subarr(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int s = i;
            for(int j =i;j<n;j++){
                int e = j;
               for(int k =s;k<= e;k++){
                    System.out.print(arr[k] + ",");
               }
               
System.out.println();
            }
           System.out.println();
        }
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
       subarr(arr);
       
        
    }
}