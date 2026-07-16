package org.greedyalgo;
import java.util.*;
    public class FractionalKnapsack {
        static class Item {
            int weight;
            int value;

            public Item(int weight, int value) {
                this.weight = weight;
                this.value = value;
            }
        }

        public static double fractionalKnapsack(int[] weights, int[] values, int capacity) {
            int n = weights.length;

            // Create list of items
            List<Item> items = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                items.add(new Item(weights[i], values[i]));
            }

            // Sort items by value per unit weight in descending order
            Collections.sort(items, (a, b) -> Double.compare((double) b.value / b.weight, (double) a.value / a.weight));

            double maxProfit = 0;

            // Fill knapsack greedily
            for (Item item : items) {
                if (capacity >= item.weight) {
                    maxProfit += item.value;
                    capacity -= item.weight;
                } else {
                    maxProfit += (double) item.value / item.weight * capacity;
                    break;
                }
            }

            return maxProfit;
        }

        public static void main(String[] args) {
            int[] weights = {10, 20, 30};
            int[] values = {60, 100, 120};
            int capacity = 50;

            double maxProfit = fractionalKnapsack(weights, values, capacity);
            System.out.println("Maximum profit that can be obtained: " + maxProfit);
        }
    }

