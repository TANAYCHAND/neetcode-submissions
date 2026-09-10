class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int i = 0;
        int j = i+1;
        while(j<prices.length){
            if(prices[i]>prices[j]){
                i++;
            }
            else{
                maxprofit = Math.max(maxprofit,prices[j]-prices[i]);
                j++;
            }
        }
        return maxprofit;
    }
}
