// solve stock span using stacks

// we have to find all the previous high before that stock 


package Stacks;

import java.util.Stack;

public class stockSpan {

    /**
     * Calculates the stock span for each day.
     * 
     *  stock array representing stock prices for consecutive days
     *  span  array to store the span values for each day
     * 
     * The stock span for a day is the number of consecutive days (up to and including the current day) 
     * for which the stock price was less than or equal to the price on the current day.
     */
    public static void StockSpan(int stock[], int span[]) {
        Stack<Integer> prevHigh = new Stack<>(); // Stack to store indices of previous higher prices

        // First day's span is always 1 (no days before it)
        span[0] = 1;
        prevHigh.push(0); // Push index of the first day

        // Process stock prices from day 1 to last
        for (int i = 1; i < stock.length; i++) {
            int curr = stock[i];

            // Remove all previous days with a lower price than current
            while (!prevHigh.isEmpty() && curr > stock[prevHigh.peek()]) {
                prevHigh.pop();
            }

            // If stack is not empty, span is the difference between current index and last higher price's index
            if (!prevHigh.isEmpty()) {
                span[i] = i - prevHigh.peek();
            } 
            // If stack is empty, it means current price is the highest so far
            else {
                span[i] = i + 1;
            }

            // Push current day's index onto the stack
            prevHigh.push(i);
        }
    }

    public static void main(String[] args){

        int stocks[] = {100 , 80 , 60 , 70 , 60 , 85 , 100};
        int span[] = new int[stocks.length];
        StockSpan(stocks, span);

        for(int i : span){
            System.out.print(i + " ");
        }System.out.println();
    }

}