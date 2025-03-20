// ****
// *  *
// *  *
// ****
public class HollowRect{
 
 public static void hollowrect(int n){
    for(int row = 1;row<=n;row++){
        for(int col = 1;col<=n;col++){
            if(row == 1 || row == n || col == 1 || col==n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
 }
    public static void main(String args[]){
        hollowrect(5);
    }
}