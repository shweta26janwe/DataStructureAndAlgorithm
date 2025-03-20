import java.util.Scanner;

public class LeftRotate{
    public static void leftrotatearr(int arr[],int n,int d){
        int temp[] = new int[d];
        for(int i=0;i<d;i++){
            temp[i] = arr[i];
        }

        for(int i=d;i<n;i++){
            arr[i-d] = arr[i];
        }

        for(int i=n-d;i<n;i++){
            arr[i] = temp[i-(n-d)];
        }

        System.out.print("Left rotate array by "+ d + " place is ");
        for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
        }
    }

    public static void reversearr(int arr[],int s,int e){
         while(s<=e){
            int t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            s++;
            e--;
         }
    }

    public static void beleft_rotate_arr(int arr[],int n, int d){
          reversearr(arr,0,d-1);
          reversearr(arr,d,n-1);
          reversearr(arr,0,n-1);
        System.out.print("Left rotate array by "+ d + " place is ");
        for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array");
        for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();
        }

        System.out.println("Enter the num for rotate the that num place");
        int d =sc.nextInt();
        // leftrotatearr(arr,n,d);
        beleft_rotate_arr(arr,n,d);
    }
}