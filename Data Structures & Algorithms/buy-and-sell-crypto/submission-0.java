class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=100000000;
        int left=0;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            profit=prices[i]-min;
            max=Math.max(max,profit);
        }
        return max;
    }
}
