import java.util.Scanner;


public class SorOrNot{
 public static boolean sorornot(int arr[],int n){
    // for(int i=1;i<n;i++){
    //     if(arr[i]<arr[i-1]){
    //      return false;
    //     }
    // }
    // return true;

     for(int i=1;i<n;i++){
        if(arr[i]>=arr[i-1]){
         
        }
        else{return false;}
    }
    return true;
 }

public static void main(String args[]){
       Scanner ac = new Scanner(System.in);
       System.out.println("Enter the size of an array");
       int n = ac.nextInt();
        int arr[] = new int[n];
       System.out.println("enter the elements of an array");
       for(int i=0;i<n;i++){
            arr[i]=ac.nextInt();
       }
       
        boolean a =sorornot(arr,n);
        System.out.println("sorted:"+ a);
}
}