import java.util.*;
import java.util.Scanner;

public class RemDupl{
    public static int remduplicates(int arr[],int n){
        int i=0;
            for(int j=1;j<n;j++){
                if(arr[j]!=arr[i]){
                    arr[i+1]=arr[j];
                    i++;
                }
            }
      
        return i+1;
    }

       public static void main(String args[]){
       Scanner ac = new Scanner(System.in);
       System.out.println("Enter the size of an array");
       int n = ac.nextInt();
        int arr[] = new int[n];
       System.out.println("enter the elements of an sorted array");
       for(int i=0;i<n;i++){
            arr[i]=ac.nextInt();
       }
       
       int size = remduplicates(arr,n);
       System.out.println("Unique number of elements are:" + size);
    }
}