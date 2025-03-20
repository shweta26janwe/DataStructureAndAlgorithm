import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.");
        int num = sc.nextInt();
        int r, sum = 0;
        int t = num;
        while(t > 0){
            r = t % 10;
            sum = sum + (r*r*r);
            t  = t / 10;
        }   
        if(num == sum){
             System.out.println(num + " is armstrong");  
        }
        else{
            System.out.println( num +" is not armstrong");  
        }
         }
}