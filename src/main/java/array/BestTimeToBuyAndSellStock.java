package array;

//[7,1,5,3,6,4]

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};
        int profit = new BestTimeToBuyAndSellStock().maxProfit(prices);
        System.out.println(profit);
    }

    public int maxProfit(int[] prices) {

        int profit = 0;
        int bestPrice = prices[0];
        boolean isBuy = true;
        int stockPrice = 0;

        for (int i = 1; i < prices.length; i++) {
            if (isBuy) {
                if (prices[i] <= bestPrice) {
                    bestPrice = prices[i];
                } else {
                    stockPrice = bestPrice;
                    isBuy = false;
                    i--;
                }
            } else {
                if (prices[i] >= bestPrice) {
                    bestPrice = prices[i];
                    if (i == prices.length - 1 && bestPrice == prices[prices.length - 1]) {
                        profit += (bestPrice - stockPrice);
                    }
                } else {
                    profit += (bestPrice - stockPrice);
                    stockPrice = 0;
                    isBuy = true;
                    i--;
                }
            }
        }
        return profit;
    }
}
