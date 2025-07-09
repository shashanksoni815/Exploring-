package Arrays;

public class stocks {

    public static int buyAndCell(int prices[]) {
        // int size = prices.length;
        // int buyPrice[] = new int[size];
        // int sellingPrice = 0;
        // buyPrice[0] = prices[0];
        // // sellingPrice[0] = prices[0];
        // // int sellingPrice = Integer.MIN_VALUE;
        // // int profit = 0;
        // for (int i = 1; i < prices.length - 1; i++) {
        //     buyPrice[i] = Math.min(prices[i], prices[i-1]);
        //     // sellingPrice[i] = Math.max(prices[i], prices[i+1]);
        //     sellingPrice = Math.max(prices[i+1] , sellingPrice);
        //     // sellingPrice = 
        // }
        // System.out.println("Best selling price = " + sellingPrice );
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) { // profit
                int profit = prices[i] - buyPrice; // todays profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }


    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndCell(prices));
    }
}
