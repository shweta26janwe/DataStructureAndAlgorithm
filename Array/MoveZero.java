  import java.util.Scanner;
  import java.util.ArrayList;

  public class MoveZero{
    public static void move_zeros(int arr[],int n){
        ArrayList<Integer> temp= new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                temp.add(arr[i]);
            }
        }

        for(int i=0;i<temp.size();i++){
            arr[i] = temp.get(i);   
        }
        int tl=temp.size();
        for(int i=tl;i<n;i++){
            arr[i]=0;
        }
         System.out.print("Our array with zeros at last is ");
        for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
        }
    }

    public static int swap(int a,int b){
        int t=a;
        a=b;
        b=t;
         System.out.println("a and b is " + a+ " "+b);

        return 0;

    }

    public static void opmove_zeros(int arr[],int n){
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
               }
            
        }
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                // swap(arr[i],arr[j]);
                j++;
            }
        }
        System.out.print("Our array with zeros at last is ");
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
        // move_zeros(arr,n);
        opmove_zeros(arr,n);
    }
  }