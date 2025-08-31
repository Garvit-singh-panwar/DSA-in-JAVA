package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;
public class FractionalKnapsack {

    public static void main(String args[]) {

        int quantity[] = {60, 100, 120};   // values
        int weight[] = {10, 20, 30};       // weights

        int n = quantity.length;
        int capacity = 50;

        // Store index and ratio
        double ratio[][] = new double[n][2];

        for (int i = 0; i < n; i++) {
            ratio[i][0] = i; // store index
            ratio[i][1] = (double) quantity[i] / weight[i]; // value/weight ratio
        }

        // Sort by ratio in descending order
        Arrays.sort(ratio, (a, b) -> Double.compare(b[1], a[1]));
        // if we want to sort in ascending we use Arrays.sort(ratio, Comparator.comparingDouble(a -> a[1]));


        int currentWeight = 0;
        double finalValue = 0.0;

        // if we sort in ascending order then we will have to use the reverse loop length to 0
        // but we sorted in descending ordert thats why we are not using reverse loop
        for (int i = 0; i < n; i++) {
            int idx = (int) ratio[i][0]; // item index
            if (currentWeight + weight[idx] <= capacity) {
                // take whole item
                currentWeight += weight[idx];
                finalValue += quantity[idx];
            } else {
                // take fraction of item
                int remaining = capacity - currentWeight;
                finalValue += ratio[i][1] * remaining;
                break; // knapsack is full
            }
        }

        System.out.println("Maximum value in Knapsack = " + finalValue);
    }
}