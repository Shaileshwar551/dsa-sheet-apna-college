class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maximumProfit = 0;
        int minimumSofar = prices[0];
        int days = prices.length; 
        
        for (int day = 0; day < days; day++)
        {
            minimumSofar = Math.min(minimumSofar, prices[day]);
            int currentProfit = prices[day] - minimumSofar;
            maximumProfit = Math.max(maximumProfit, currentProfit);
        }
        return maximumProfit;
    }
}