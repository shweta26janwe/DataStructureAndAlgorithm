import java.util.Scanner;

public class Divisors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int num = sc.nextInt();
        // int num = 36;
        // for(int i=1;i<=num;i++){   
        // if(num % i == 0){
        //      System.out.print(i + " ");  
        // }

        for(int i=1;i<= Math.sqrt(num);i++){   
        if(num % i == 0){
             System.out.print(i + " ");
             if((num/i)!= i){
           System.out.print((num/i) + " ");
             }
        }
        }
    }
}