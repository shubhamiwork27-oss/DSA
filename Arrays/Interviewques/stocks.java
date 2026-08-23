public class stocks {

    public static int stock(int amount[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < amount.length; i++) {
            if(buyPrice < amount[i]){ //profit
                int profit = amount[i] - buyPrice;
                maxprofit = Math.max(maxprofit, profit);
            }else{
                buyPrice = amount[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int amount[] = {7,1,5,3,6,4};
        int profit = stock(amount);
        System.out.println(profit);
    }
}