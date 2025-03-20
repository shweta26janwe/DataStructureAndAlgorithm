import java.util.*;
import java.util.Scanner;

public class RightAngle{

    // *
    // **
    // ***
    public static void forward(int n){
         for(int i = 0;i<n;i++){
            for(int j =0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

// ****
// ***
// **
// *
     public static void reverse(int n){
         for(int i = 0;i<n;i++){
            for(int j =n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no for 90 degree pattern");
        int n = sc.nextInt();
        forward(n);
        reverse(n);
    }
}