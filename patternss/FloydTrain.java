// 1
// 2 3
// 4 5 6
// 7 8 9 10

import java.util.*;
import java.util.Scanner;

public class FloydTrain{

    public static void number(int n){
        int c =1;
         for(int i = 1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(c +" ");
                c++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no for pattern");
        int n = sc.nextInt();
        number(n);
        
    }
}