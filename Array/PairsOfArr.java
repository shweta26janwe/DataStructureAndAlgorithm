import java.util.*;
import java.util.Scanner;
public class PairsOfArr{
    public static void pairsofarr(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j =i+1;j<n;j++){
                System.out.print( "(" + arr[i] + "," + arr[j] +")");
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
        pairsofarr(arr);
       
        
    }
}