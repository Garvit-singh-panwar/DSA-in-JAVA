package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
// Indian Coins
// we are given an infinite supply of denominations [1,2,5,10,20,100,500 , 2000];
// Find min no. of coins/notes to make change for a value v.

public class IndianCoinDenomination {

    public static void main(String[] args) {

        Integer coins[] = {1, 2, 5, 10, 20, 100, 500, 2000};
        Arrays.sort(coins, Comparator.reverseOrder()); // sort descending

        int value = 540;
        int difference = value;

        ArrayList<Integer> change = new ArrayList<>();

        int i = 0;
        while (difference > 0 && i < coins.length) {
            int currnote = coins[i];

            // keep using the same note until it doesn't fit
            while (currnote <= difference) {
                change.add(currnote);
                difference -= currnote;
            }
            i++;
        }

        System.out.println("Value: " + value);
        System.out.println("Coins used: " + change);
        System.out.println("Minimum coins = " + change.size());
    }
    
}