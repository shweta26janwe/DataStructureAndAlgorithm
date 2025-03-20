import java.util.*;
import java.util.Scanner;

public class NumPatt{

// 1234
// 123
// 12
// 1
    public static void revnumpat(int n){
        for(int r=0;r<n;r++){
            for(int c=1;c<=n-r;c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }

// 1
// 12
// 123
// 1234
    public static void number(int n){
         for(int i = 1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

//   A
//   BC
//   DEF
//   GHIJ
     public static void alphabet(int n){
        char ch = 'A';
         for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(ch +" ");
                ch++;
            }
            System.out.println();
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no for 90 degree pattern");
        int n = sc.nextInt();
        number(n);
        revnumpat(n);
        // alphabet(n);
    }
}