import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Union{
public static ArrayList<Integer> betunionofarray(int a[],int b[],int n1,int n2){
 ArrayList<Integer> union = new ArrayList<>();
        int i=0;
        int j=0;
        // int c=0;  
        while(i<n1 && j<n2){  
            if(a[i] <= b[j]){
                if(union.size() == 0 || union.get(union.size()-1) != a[i]){
                    union.add(a[i]);
                    // c++;
                }
                i++;
            }else{
                 if(union.size() == 0 || union.get(union.size()-1) != b[j]){
                    union.add(b[j]);
                    // c++;
                }
                j++;
            }

        }
        while(j<n2){
             if(union.size() == 0 || union.get(union.size()-1) != b[j]){
                    union.add(b[j]);
                    // c++;
                }
                j++;
        }
        while(i<n1){
               if(union.size() == 0 || union.get(union.size()-1) != a[i]){
                    union.add(a[i]);
                    // c++;
                }
                i++;
        }
      return union;
        }

public static ArrayList<Integer> hashunionofarray(int a[],int b[],int n1,int n2){
 HashSet <Integer> s =new HashSet<>();
 ArrayList<Integer> union = new ArrayList<>();
 for(int i=0;i<n1;i++){
    s.add(a[i]);
 }
 for(int i=0;i<n2;i++){
    s.add(b[i]);
 }
for(int it:s){
    union.add(it);

}
return union;
}

public static ArrayList<Integer> bruunionofarray(int a[],int b[],int n1,int n2){
 HashMap <Integer,Integer> freq =new HashMap<>();
 ArrayList<Integer> union = new ArrayList<>();
 for(int i=0;i<n1;i++){
    freq.put(a[i],freq.getOrDefault(a[i],0)+1);
 }
 for(int i=0;i<n2;i++){
        freq.put(b[i],freq.getOrDefault(b[i],0)+1);

 }
for(int it:freq.keySet()){
    union.add(it);

}
return union;
}
    
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        // ArrayList<Integer> union = new ArrayList<>();
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
    //    ArrayList<Integer> union = betunionofarray(a,b,n1,n2);
    //    ArrayList<Integer> union = hashunionofarray(a,b,n1,n2);
       ArrayList<Integer> union = bruunionofarray(a,b,n1,n2);
System.out.print("Union of  2 array is ");
        // int us = union.size();
        // for(int u=0;u<us;u++){
        //    System.out.print(union.get(u)+" ");

        for(int val: union){
            System.out.print(val+" ");
        }
    }
}
