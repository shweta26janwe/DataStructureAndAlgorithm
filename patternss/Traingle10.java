1
01
101
0101

public class Traingle10{

    public static void o1traingle(int n){
        for(int r=1;r<=n;r++){
            for(int c= 1;c<=r;c++){
                if((r+c) % 2 == 0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }


// this is my logic
    //   public static void o1traingle(int n){
    //     for(int r=1;r<=n;r++){
    //         if(r % 2 == 0){
    //         for(int c= 1;c<=r;c++){
    //             if(c % 2 == 0){
    //                 System.out.print(1);
    //             }else{
    //                 System.out.print(0);
    //             }
    //         }
    //         System.out.println();
    //         }else{
    //              for(int c= 1;c<=r;c++){
    //             if(c % 2 == 0){
    //                 System.out.print(0);
    //             }else{
    //                 System.out.print(1);
    //             }
    //         }
    //         System.out.println();
    //         }
    //     }
    // }


    public static void main(String args[]){
        o1traingle(6);
    }
}