import java.util.*;
import java.util.Scanner;
public class BinToDec{
    public static void binary(int n){
        int myno = n;
        int pow = 0;
        int dec=0;
        while(n>0){
            int ld = n%10;
            dec = dec + (ld * (int)Math.pow(2,pow));
            pow++;
            n = n/10;
        }
        System.out.print("Decimal number of given binary no.   " + myno + " is " + dec);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number : ");
        int n = sc.nextInt();
        binary(n);
    }
}