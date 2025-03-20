import java.util.*;
import java.util.Scanner;
public class ReverseArr{
    public static void reversearr(int arr[]){
        int s =0 ;
        int l = arr.length-1;
        while(s < l){
           int temp = arr[s];
           arr[s] = arr[l];
           arr[l] = temp;
           s++;
           l--;
        }
    }
    public static void main(String args[]){
        // int arr[] = { 34, 12, 3 ,7 ,47};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of arr ");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the ele of arr");
        
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
       reversearr(arr);
        System.out.println("Our reverse array is ");

        for(int i = 0;i<n;i++){
        System.out.print(arr[i] + " ");

        }
    }
}