import java.util.Scanner;

public class Gccd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two  no.");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int gcd = 0;
        for(int i=1;i<= Math.min(n1,n2);i++){   
        if((n1 % i == 0) && (n2 % i == 0)){
             gcd = i;
             }
             }
              System.out.print("gcd is " + gcd);
               }
    }
