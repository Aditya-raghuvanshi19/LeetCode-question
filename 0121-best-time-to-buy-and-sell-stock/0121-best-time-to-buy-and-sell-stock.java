class Solution {
    public int maxProfit(int[] prices) {
       int profit=0;
       int buy=prices[0];
       for(int i=1;i<prices.length;i++){
        int cost=prices[i]-buy;
        profit=Math.max(profit,cost);
        buy=Math.min(buy,prices[i]);

       } 
       return profit;
    }
}