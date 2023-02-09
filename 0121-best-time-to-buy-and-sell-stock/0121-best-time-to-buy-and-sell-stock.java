class Solution {
    public int maxProfit(int[] prices) {
        int high = prices[0];
        int low = prices[0];
        int diff = high - low;
        for(int i =0;i<prices.length;i++){
            if(prices[i]>=high){
                high = prices[i];
                diff = Math.max(diff, high - low);                
            }
            if(prices[i] <= low){
                low = prices[i];
                high = prices[i];
            }
        }  
        System.out.println(high);
        System.out.println(low);     
        return Math.max(diff,high - low);
    }
}