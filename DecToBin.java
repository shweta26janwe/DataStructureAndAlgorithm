import java.util.*;
import java.util.Scanner;
public class DecToBin{
    public static void decimal(int n){
        int myno = n;
      int pow = 0;
        int bin=0;
        while(n>0){
            int ld = n%2;
          bin =  bin + ld * (int)Math.pow(10,pow);
          pow++;
            n = n/2;
            //Here divide by 2
        }
        System.out.print("Binary number of given decimal no. " + myno + " is " + bin);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number : ");
        int n = sc.nextInt();
        decimal(n);
    }
}