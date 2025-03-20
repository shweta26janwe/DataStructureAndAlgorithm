import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class SecLar{
    public static int betseclar(int arr[],int n){
        int largest =arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        int slar = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>slar && arr[i]!=largest){
                slar = arr[i];
            }
        }
        System.out.println("largesrt:"+largest + "     Second largest:"+slar);
        return 0;
    }

    public static int bseclar(int arr[],int n){
        Arrays.sort(arr);
        int largest = arr[n-1];
        int slar=0;
        System.out.println("largest:"+arr[n-1]);
        for(int i=n-2;i>0;i--){
            if(arr[i]!=largest){
                slar = arr[i];
                break;
            }
        }
         System.out.println("seclar:"+ slar);

        return 0;
    }
    
    public static int oseclar(int arr[],int n){
        int lar=arr[0], slar=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>lar){
                slar = lar;
                lar = arr[i];
            }
            else if(arr[i]<lar && arr[i]>slar){
                slar = arr[i];
            }
        }
        System.out.println("largesrt:"+lar + "     Second largest:"+slar);
        return 0;
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
       
        oseclar(arr,n);
    }
}