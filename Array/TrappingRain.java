
public class TrappingRain{
    public static int trappedrain(int height[]){
        int n=height.length;
        int trappedwater = 0;
        int lmax[] = new int[n];
        lmax[0] = height[0];
        for(int i = 1;i<n;i++){
            lmax[i] = Math.max(lmax[i-1],height[i]);
        }
         for(int i = 0;i<n;i++){
            System.out.print(lmax[i] + " ");
        }
        System.out.println();
        int rmax[] = new int[n];
        rmax[n-1] = height[n-1];
        for(int i = n-2;i>=0;i--){
          rmax[i] = Math.max(rmax[i+1],height[i]);
        }
 for(int i = 0;i<n;i++){
            System.out.print(rmax[i] + " ");
        }
        System.out.println();
        for(int i = 0;i<n;++i){
            int waterlevel= Math.min(lmax[i],rmax[i]);
            trappedwater += (waterlevel - height[i]);
        }
        return trappedwater;
    }
public static void main(String args[]){
  int height[] = {4,2,0,6,3,2,5};
  int t = trappedrain(height);
  System.out.println("Trapped water is " + t);
}
}