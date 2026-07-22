package dsa.dsa.story_based;

import java.util.*;

public class StockExchangeHeap {

    // ---------- Max Heap Implementation ----------
    static class MaxHeap {
        int[] heap;
        int size;

        MaxHeap(int[] arr) {
            heap = Arrays.copyOf(arr, arr.length);
            size = arr.length;
            buildHeap();
        }

        // Build max heap using heapify
        private void buildHeap() {
            for (int i = size / 2 - 1; i >= 0; i--) {
                heapify(i);
            }
        }

        // Heapify a subtree
        private void heapify(int i) {
            int largest = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < size && heap[left] > heap[largest]) {
                largest = left;
            }

            if (right < size && heap[right] > heap[largest]) {
                largest = right;
            }

            if (largest != i) {
                swap(i, largest);
                heapify(largest);
            }
        }

        private void swap(int i, int j) {
            int temp = heap[i];
            heap[i] = heap[j];
            heap[j] = temp;
        }

        public void printHeap() {
            System.out.println("Max Heap:");
            for (int value : heap) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Heap Sort
        public void heapSort() {
            int originalSize = size;

            for (int i = size - 1; i > 0; i--) {
                swap(0, i);
                size--;
                heapify(0);
            }

            size = originalSize;

            System.out.println("Heap Sort (Ascending):");
            for (int value : heap) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // ---------- Main Function ----------
    public static void main(String[] args) {

        // Example market capitalizations (in billions)
        int[] marketCaps = {120, 450, 300, 700, 200, 650, 500};

        // Build Max Heap from scratch
        MaxHeap maxHeap = new MaxHeap(marketCaps);
        maxHeap.printHeap();

        // Top-K performing stocks using PriorityQueue
        String[] company = {
                "Reliance",
                "TCS",
                "Infosys",
                "HDFC Bank",
                "ICICI Bank",
                "Bharti Airtel",
                "SBI"
        };

        int[] performance = {18, 25, 15, 32, 21, 28, 19};

        int k = 3;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int value : performance) {
            pq.offer(value);
        }

        System.out.println("\nTop " + k + " Performing Stocks:");
        for (int i = 0; i < k; i++) {
            int score = pq.poll();

            for (int j = 0; j < performance.length; j++) {
                if (performance[j] == score) {
                    System.out.println(company[j] + " -> Performance: " + score + "%");
                    performance[j] = -1; // Prevent duplicate printing
                    break;
                }
            }
        }

        System.out.println();
        maxHeap.heapSort();
    }
}