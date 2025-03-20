import java.util.Scanner;

public class DigitCount{
    public static void main(String[] args){
        Scanner co = new Scanner(System.in);
        System.out.println("Enter the no.");
        int c = co.nextInt();
        int ld;
        // int count = 0;
        // while(c>0){
        //     ld = c%10;
        //     count = count + 1;
        //     c = c / 10;
        // }

        int count = (int)(log10(c) + 1);
        System.out.println("Count is " + count);
    }
}


//time compexity o(log10(N)) if div then log