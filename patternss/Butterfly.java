// *      *
// **    **
// ***  ***
// ********
// ***  ***
// **    **
// *      *

public class Butterfly{
    public static void butterfly(int n){
     for(int r=1;r<=n;r++){
        for(int st=1;st<=r;st++){
          System.out.print("*");
        }
        for(int st=1;st<=(2*n-2*r);st++){
          System.out.print(" ");
        }
        for(int st=1;st<=r;st++){
          System.out.print("*");
        }
         System.out.println();
     }

      for(int r=n;r>=1;r--){
        for(int st=1;st<=r;st++){
          System.out.print("*");
        }
        for(int st=1;st<=(2*n-2*r);st++){
          System.out.print(" ");
        }
        for(int st=1;st<=r;st++){
          System.out.print("*");
        }
         System.out.println();
     }
    }


    public static void main(String args[]){
        butterfly(4);
    }
}