import java.util.*;
import java.util.Scanner;

public class PrimeInRange{

public static void range(int n){
  System.out.print("Prime numbers in range 0 and " + n + " are ");
 int count = 0 ;
  for(int i = 2;i<=n;i++){
    if(isPrime(i)){
      System.out.print(i + " ");
      count++;
    }
  }
  System.out.println();
  System.out.println("Number of prime no. in that range are " + count);

}

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
        System.out.print("Enter a range number to find prime numbers in between 0 and that no.  : ");
        int n = sc.nextInt();
        range(n);
       
    }
}