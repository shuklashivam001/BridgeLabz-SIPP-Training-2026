package dsa.dsa.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class TopKLargestTransactions {

    static List<Integer> findTopKTransactions(int[] transactions, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int amount : transactions) {

            if (minHeap.size() < k) {
                minHeap.offer(amount);
            } else if (amount > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(amount);
            }
        }

        return new ArrayList<>(minHeap);
    }

    public static void main(String[] args) {

        int[] transactions = {4500, 9200, 3000, 12000, 6700, 8500, 15000};
        int k = 3;

        List<Integer> topTransactions = findTopKTransactions(transactions, k);

        System.out.println("Top " + k + " Largest Transactions:");
        System.out.println(topTransactions);
    }
}