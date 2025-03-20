import java.util.Scanner;
// import java.util.array;
   public class SelectionSort{
    public static void main(String args[]){
        // int[] arr = {13,24,20,21};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("Enter the elemrnts of array");
        for(int i = 0 ;i<s;i++){
            System.out.println("Enter the elemrnt " + i);
                arr[i] = sc.nextInt();
        }
         System.out.println("Before sapping:");
        for(int ele : arr){
            System.out.print(ele +" ");
        }
        System.out.println();  
        int min;
        int temp;
        for(int i = 0;i<=arr.length-2;i++){
            min = i;
            for(int j=i;j<=arr.length-1;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After sapping:");
        for(int ele : arr){
            System.out.print(ele +" ");
        }
    }
   }