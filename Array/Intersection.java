import java.util.Scanner;
import java.util.ArrayList;

public class Intersection{
 

 public static ArrayList<Integer> intersectionofarray(int a[],int b[]){
     ArrayList<Integer> ans = new ArrayList<>();
     int i=0;int j=0;
     while(i<a.length && j<b.length){
        if(a[i]<b[j]){
            i++;
        } else if(a[i]>b[j]){
            j++;
        }else{
            ans.add(a[i]);
            i++;
            j++;
        }
     }
     return ans;
      }

    public static ArrayList<Integer> bruintersectionofarray(int a[],int b[]){
     ArrayList<Integer> ans = new ArrayList<>();
     int visited[] = new int[b.length];
     for(int i=0;i<a.length;i++){
        for(int j=0;j<b.length;j++){
            if(a[i] == b[j] && visited[j]==0){
                ans.add(b[j]);
                visited[j]=1;
                break;
            }
            else if(b[j]>a[i]) break;
        }
     }
     return ans;
      }

     public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
    
        System.out.println("Enter the size of an 2 array");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int a[] = new int[n1];
        int b[] = new int[n2];
        System.out.println("Enter the elements of array1");
        for(int i=0;i<n1;i++){
           a[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of array2");
         for(int i=0;i<n2;i++){
           b[i] = sc.nextInt();
        }
        // ArrayList<Integer> ans = intersectionofarray(a,b);
        ArrayList<Integer> ans = bruintersectionofarray(a,b);
        System.out.print("Intersection of 2 array is ");
        for(int val: ans){
             System.out.print(val+" ");
         }
}
}