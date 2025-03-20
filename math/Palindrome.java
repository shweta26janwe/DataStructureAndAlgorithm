import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
        Scanner co = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = co.nextInt();
        int temp,rem, rev = 0;
        temp = n;
        while(temp>0){
            
            rem = temp%10;
            rev= rev * 10 + rem; 
            temp = temp / 10;
        }
        if(n ==  rev){
        System.out.println("The no. is palindrome");
        }
        else{
             System.out.println("The no. is not palindrome");
            
        }
    }
}