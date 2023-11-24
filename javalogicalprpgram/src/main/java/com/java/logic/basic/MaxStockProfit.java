package com.java.logic.basic;

public class MaxStockProfit {
    static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                // If the price increases, buy on the previous day and sell on the current day
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] stockPrices = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(stockPrices);
        System.out.println("Maximum profit: " + maxProfit);
    }
}