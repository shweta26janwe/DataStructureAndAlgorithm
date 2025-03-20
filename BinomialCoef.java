import java.util.*;
import java.util.Scanner;

public class BinomialCoef{
public static int fact(int n){
    int fact = 1;
    if(n==1){
        return 1;
    }else{
        for(int i=1;i<=n;i++){
            fact = fact *i;
        }
        return fact;
    }
}
public static int coefficient(int n,int r){
    //n!/r!(n-r)!
   int nf = fact(n);
   int rf = fact(r);
   int sf = fact(n-r);
   int bbc = nf/ rf * sf;
   return bbc;

}

public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n and r for binomial coefficient : ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int bc = coefficient(n,r);
        System.out.println("Binomial coefficient of number is " + bc);
        // alphabet(n);
    }
}