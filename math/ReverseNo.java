import java.util.Scanner;

public class ReverseNo{
    public static void main(String[] args){
        Scanner co = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = co.nextInt();
        int rem, rev = 0;

        while(n>0){
            rem = n%10;
            rev= rev * 10 + rem; 
            n = n / 10;
        }
        System.out.println("reverse no.  is " + rev);
    }
}