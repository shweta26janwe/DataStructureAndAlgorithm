public class BuySell{
    public static int buysell(int price[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0;i<price.length;i++){
            if(buyprice < price[i]){
                int profitt = price[i] - buyprice;
                maxprofit = Math.max(profitt,maxprofit);
            }else{
                buyprice = price[i];
            }
            
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int price[] = {7,1,5,3,6,4};
        int pro = buysell(price);
        System.out.println("our profit is " + pro);
    }
}