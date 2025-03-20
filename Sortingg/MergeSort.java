import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class MergeSort{
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.println("Entet the size of array");
        int size = in.nextInt();

        int arr[] = new int[size];
        List<Integer> temp = new ArrayList<>();
        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++){
            arr[i] = in.nextInt();
        }
        int low =0;
        int high = size-1;
        mergeSort(arr, low,high);
        System.out.println("sorted elements are:");
        for(int ele : arr){
            System.out.print(ele + " ");
    }
    }
         public static void mergeSort(int arr[] ,int low,int high){
            if(low>=high){
                return;
            }

            int mid = (low + high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
              
            
        }

        public static void merge(int arr[] , int low,int mid, int high){
            List<Integer> temp = new ArrayList<>();
        
            int left = low;
            int right = mid+1;
            while((left <= mid) && (right<=high)){
            if(arr[left] < arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
            }
            while(left <= mid){
            temp.add(arr[left]);
            left++;
            }
            while(right<=high){
            temp.add(arr[right]);
            right++;
            }
            for(int i = low;i<=high;i++){
            arr[i] = temp.get(i-low);
            }
         
}
}