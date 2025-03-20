import java.util.Scanner;

public class BubbleSort{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Entet the size of array");
        int size = in.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++){
            arr[i] = in.nextInt();
        }

        // for(int i=size-1;i>=1;i--){
        //     int didswap = 0;
        //     for(int j=0;j<=i-1;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //             didswap =1;
        //         }
        //     }
        //     if(didswap == 0)
        //     {
        //         break;
        //     }
        // }
        for(int i= 0; i< size;i++){
            for(int j= 0;j<size-i-1;j++){                                            
          if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                }
            }
        }
        
        System.out.println("sorted elements are:");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}