import java.util.Scanner;

public class QuickSort{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Entet the size of array");
        int size = in.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++){
            arr[i] = in.nextInt();
        }
        int low = 0;
        int high=size-1;
        quickSort(arr,low,high);
        


         System.out.println("sorted elements are:");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }

    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int partition = part(arr,low,high);
            quickSort(arr ,low,partition-1);
            quickSort(arr,partition+1,high);
        }
    }

    public static int part(int arr[],int low,int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i]<=pivot && i <= high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low + 1){
                j--;
            }
            if(i<j){
                //  swap(arr[i],arr[j]);
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap(arr[j],arr[low]);
        int t = arr[j];
        arr[j] = arr[low];
        arr[low] = t;
        return j;
    }
    // public static void swap(int a,int b){
    //             int temp = a;
    //             a= b;
    //             b= temp;
    // }
}