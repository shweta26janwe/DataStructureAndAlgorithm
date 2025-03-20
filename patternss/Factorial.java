import java.util.*;
import java.util.Scanner;

public class Factorial{
    public static int fact(int n){
        int fact = 1;
        if(n == 1){
            return 1;
        }else
        {
            for(int i = 1;i<=n;i++){
                  fact = fact * i;
            }
            return fact;  
        }
    }
 public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the factorial number ");
        int n = sc.nextInt();
        int f = fact(n);
System.out.println("Factorial of number is" + f);
        // alphabet(n);
    }
}