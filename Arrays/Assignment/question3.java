package Assignment;

// Question3 you are given an array prices[]
// is the price of a given stock on the ith day
// Return the maximum profit you can achive from this transaction 
// if you can not achive any profit return 0.

// Example 1: input price = [7,1,5,3,6,4]
// output: 5
// buy on day2 (price = 1) and sell on day 5 (price = 6 ) profit = 6-1 = 5
// note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell

// Example 2: input prices =[7,6,4,3,1]
// output: 0
// Explanation: IN this case, no transaction are done and the max profit = 0




public class question3 {

      // Here’s what we are doing:
    // We are calculating the maximum profit from stock trading (one buy and one sell).
    // If the stock keeps going down (i.e., always in loss), we return maxProfit = 0;
    
    // We start by assuming we bought the stock on the first day, so we set buyPrice = stockPrices[0].
    // Now, we check each following day's price to see if:
    //  - It is lower than our current buy price → we update buyPrice because it's a better day to buy.
    //  - It is higher than the buy price → we calculate the profit if we sold it today.

    // If the profit is greater than our current maxProfit, we update maxProfit
    // because this gives us a better profit (i.e., better sell day).

    // So by the end of the loop, we’ve tracked the best day to buy and the best day to sell
    // to get the highest possible profit from one transaction.
    public static int maxProfit(int stockPrices[]){
        int maxProfit = 0;
        int buyPrice  = stockPrices[0];
        for(int i = 1 ; i < stockPrices.length ; i++){
             if(buyPrice < stockPrices[i]){
                int profit = stockPrices[i]-buyPrice;
                if(maxProfit < profit){
                    maxProfit = profit;
                }
             }
             else{
                buyPrice = stockPrices[i];
             }
            
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        
        int array[] = {7,6,4,3,1};


        System.out.println("The maximum profit we can gain from this stock is " + maxProfit(array));
        
    }

    
}