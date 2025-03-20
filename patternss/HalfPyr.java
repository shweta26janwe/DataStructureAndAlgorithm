//    *
//   **
//  ***
// ****

public class HalfPyr{
  public static void Inverted_roted_half_pyramid(int n){
    for(int r = 1;r<=n;r++){
        for(int s=1;s<=n-r;s++){
            System.out.print(" ");
        }
        for(int st=1;st<=r;st++){
            System.out.print("*");
        }
           System.out.println();
    }
  }
    public static void main(String args[]){
        Inverted_roted_half_pyramid(4);
    }
}