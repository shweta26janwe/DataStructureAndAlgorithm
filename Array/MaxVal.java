import java.util.Arrays;

public class MaxVal{
    public static void main(String[] args){
        int[] arr ={1, 5, 6, 78, 8};
       

        System.out.println(max(arr)); 
         System.out.println(max(arr,1,3)); 
    }
//this return value between this range
    static int maxrange(int[] arr, int start, int end ){
        if(end>start){
            return -1;
        }
        if(arr == null){
            return -1;
        }
        int maxval = arr[start];
        for(int i=start;i<=end;i++){
            
            if(arr[i]> maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }

//imagin array is not empty
    static int max(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int maxval = arr[0];
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]> maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
}