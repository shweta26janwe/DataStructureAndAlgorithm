import java.util.*;
import java.util.Scanner;
public class BinarySearch{
   public static int binarysearch(int arr[], int key){
    int low = 0;
    int high = arr.length;
    while(low <= high){
    int mid = (low + high)/2;
    if(arr[mid] == key){
        return mid;
    }else if(arr[mid] > key){
        high = mid-1;
    }else{
        low = mid+1;
    }
   }
   return -1;

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
        System.out.println("Enter the key ele of arr");
         int k = in.nextInt();
         int ans = binarysearch(arr,k);
   
            if(ans == 1){
                System.out.println("Enter  ele is " + k +" present at index " + ans);

            }else{
                System.out.println("Enter the ele is " + k +" not present");

            }
         
        
           
    }
}