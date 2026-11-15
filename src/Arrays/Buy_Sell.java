package Arrays;

public class Buy_Sell {

    public static int getMaxProfitBruteForce(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    public static int getMaxProfitBetter(int[] prices) {
        int n = prices.length;
        if (n <= 1) return 0;

        int[] maxRight = new int[n];
        maxRight[n - 1] = prices[n - 1];

        // Fill highest future price from right to left
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(prices[i], maxRight[i + 1]);
        }

        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, maxRight[i] - prices[i]);
        }
        return maxProfit;
    }

    public static int getMaxProfitOptimal(int[] prices) {
        if (prices == null || prices.length <= 1) return 0;

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // Found a cheaper day to buy
            } else {
                int currentProfit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, currentProfit);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {

        int[] arr = {7, 1, 3, 5, 6, 4};

        int maxProfitBrute = getMaxProfitBruteForce(arr);
        System.out.println("Max Profit : " + maxProfitBrute);

        int maxProfitBetter = getMaxProfitBetter(arr);
        System.out.println("Max Profit : " + maxProfitBetter);

        int maxProfitOptimal = getMaxProfitOptimal(arr);
        System.out.println("Max Profit : " + maxProfitOptimal);

    }

}
