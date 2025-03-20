  import java.util.Scanner;

public class InsertionSort{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Entet the size of array");
        int size = in.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++){
            arr[i] = in.nextInt();
        }

        // for(int i=0;i<=size-1;i++){
        //  int j = i;
        //     while(j>0 && arr[j-1]>arr[j]){
        //             int temp = arr[j-1];
        //             arr[j-1]= arr[j];
        //             arr[j]= temp;
        //           j--;
        //         }
        //     }

        
         
        
        
        System.out.println("sorted elements are:");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}