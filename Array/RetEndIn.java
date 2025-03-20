import java.util.*;
import java.util.Scanner;

public class RetEndIn{
    public static int returnendingindexif1(String s){
        int n = s.length();
        if(n>0 && s.charAt(n-1)=='1'){
            return n-1;
        }else{
        return -1;}
    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the binary string");
        String s = sc.nextLine();
        int res = returnendingindexif1(s);
        if(res==-1){
                    System.out.println("string not ending with 1");

        }
        else{
        System.out.println("1 is present at index:"+res);
        }   
    }
}