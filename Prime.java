import java.util.*;
import java.util.Scanner;

public class Prime{

public static boolean isPrime(int n){
  boolean isPrime =true;
  if(n == 2){
    return true;
  }else{
    for(int i =2 ;i<=Math.sqrt(n);i++){
        if((n % i) == 0){
            isPrime = false;
            break;
        }
    }
    return isPrime;
  }
}


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check prime or not : ");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        // alphabet(n);
    }
}