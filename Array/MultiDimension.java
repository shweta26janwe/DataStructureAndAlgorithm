import java.util.Scanner;
import java.util.Arrays;
public class MultiDimension{
    public static void main(String[] args ){
        /*
        1 2 3
        4 5 6 
        7 8 9
        */
    //    int[] [] arr = new int[] [];
    //    int[] [] = {
    //             {4, 6, 7},
    //             {78, 8, 7},
    //             {4, 5, 3},
    //               };
    Scanner sc = new Scanner(System.in);
    int[] [] arr = new int[4][3];
    System.out.println(arr.length);

    //input
    //for every 
    System.out.println("Enter the matrix elements of 4 by 3: ");
    for(int row = 0; row<arr.length; row++){
        //for ech col in row
        for(int col = 0; col < arr[row].length; col++){
            arr[row][col] = sc.nextInt();
        }
    }

//output
    //for every row
    //   System.out.println("Matrix is: ");
    // for(int row = 0; row<arr.length; row++){
        //for ech col in row
        // for(int col = 0; col < arr[row].length; col++){
        //     System.out.print(arr[row][col] + " ");
        // }
        // System.out.println();
    // }

// or output
    //for every row
      /*System.out.println("Matrix is: ");
    for(int row = 0; row<arr.length; row++){*/
        //for ech col in row
            /*System.out.println(Arrays.toString(arr[row]));    
    }*/
    
//or output
System.out.println("Matrix is: ");
for(int[] a : arr){
    System.out.println(Arrays.toString(a));
}
    }
}