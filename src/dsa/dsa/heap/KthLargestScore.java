package dsa.dsa.heap;

import java.util.PriorityQueue;

public class KthLargestScore {

    static int findKthLargestScore(int[] scores, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int score : scores) {

            if (minHeap.size() < k) {
                minHeap.offer(score);
            } else if (score > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(score);
            }
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {

        int[] applicantScores = {82, 95, 74, 88, 99, 91, 76, 85};
        int k = 3;

        int answer = findKthLargestScore(applicantScores, k);

        System.out.println(k + "rd Largest Score = " + answer);
    }
}