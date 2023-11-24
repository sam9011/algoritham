package com.java.logic.basic;

import java.util.ArrayList;

public class StockSegments {

    static class Interval {
        int buy;
        int sell;
    }

    static void stockBuySell(int[] prices) {
        int n = prices.length;
        if (n == 0 || n == 1) {
            System.out.println("No Profit");
            return;
        }

        ArrayList<Interval> result = new ArrayList<>();
        int i = 0;
        while (i < n - 1) {
            // Find next local minimum (buy)
            while (i < n - 1 && prices[i + 1] <= prices[i]) {
                i++;
            }

            if (i == n - 1) {
                break; // No further buy
            }

            Interval interval = new Interval();
            interval.buy = i++;

            // Find next local maximum (sell)
            while (i < n && prices[i] >= prices[i - 1]) {
                i++;
            }

            interval.sell = i - 1;
            result.add(interval);
        }

        if (result.isEmpty()) {
            System.out.println("No Profit");
        } else {
            for (Interval interval : result) {
                System.out.println("Buy on day: " + interval.buy + " Sell on day: " + interval.sell);
            }
        }
}
}