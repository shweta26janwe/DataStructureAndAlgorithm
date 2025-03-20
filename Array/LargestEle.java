import java.util.*;
import java.util.Scanner;
public class LargestEle{
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
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            largest = Math.max(largest,arr[i]);
        }
        System.out.println("Largest element is " + largest);
    }
}