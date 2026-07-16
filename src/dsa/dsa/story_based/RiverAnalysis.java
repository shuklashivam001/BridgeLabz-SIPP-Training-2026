package dsa.dsa.story_based;

import java.util.*;

public class RiverAnalysis {

    public static int longestStablePeriod(int[] levels, int limit) {

        Deque<Integer> maxDeque = new LinkedList<>();
        Deque<Integer> minDeque = new LinkedList<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < levels.length; right++) {

            while (!maxDeque.isEmpty() && levels[maxDeque.peekLast()] < levels[right]) {
                maxDeque.removeLast();
            }
            maxDeque.addLast(right);

            while (!minDeque.isEmpty() && levels[minDeque.peekLast()] > levels[right]) {
                minDeque.removeLast();
            }
            minDeque.addLast(right);

            while (levels[maxDeque.peekFirst()] - levels[minDeque.peekFirst()] > limit) {

                if (maxDeque.peekFirst() == left) {
                    maxDeque.removeFirst();
                }

                if (minDeque.peekFirst() == left) {
                    minDeque.removeFirst();
                }

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static List<List<Integer>> threeSum(int[] arr) {

        Arrays.sort(arr);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < arr.length - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {

                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));

                    while (left < right && arr[left] == arr[left + 1]) {
                        left++;
                    }

                    while (left < right && arr[right] == arr[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static double maxAverage(int[] arr, int k) {

        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i];
            windowSum -= arr[i - k];

            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {

        int[] waterLevels = {8, 2, 4, 7};
        int limit = 4;
        System.out.println("Longest Stable Period: " + longestStablePeriod(waterLevels, limit));

        int[] pollutionIndex = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> triplets = threeSum(pollutionIndex);

        System.out.println("Triplets with Sum = 0:");
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }

        int[] values = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println("Maximum Average: " + maxAverage(values, k));
    }
}