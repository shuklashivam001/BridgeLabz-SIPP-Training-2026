package dsa.dsa.story_based;

import java.util.Arrays;

public class BinarySearchProblems {

    // 1. Normal Binary Search
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    // 2. Search in Rotated Sorted Array
    public static int searchRotated(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;

            // Left half is sorted
            if (arr[left] <= arr[mid]) {
                if (target >= arr[left] && target < arr[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            // Right half is sorted
            else {
                if (target > arr[mid] && target <= arr[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }

        return -1;
    }

    // 3. First Occurrence
    public static int firstOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int answer = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                answer = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return answer;
    }

    // 4. Last Occurrence
    public static int lastOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int answer = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                answer = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return answer;
    }

    // 5. Find Minimum Element in Rotated Sorted Array
    public static int findMinimum(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right])
                left = mid + 1;
            else
                right = mid;
        }

        return arr[left];
    }

    public static void main(String[] args) {

        // 1. Binary Search
        int[] stars = {5, 10, 15, 20, 25, 30, 35};
        System.out.println("Binary Search Index: " +
                binarySearch(stars, 20));

        // 2. Rotated Array Search
        int[] rotated = {30, 35, 40, 45, 5, 10, 15, 20, 25};
        System.out.println("Rotated Search Index: " +
                searchRotated(rotated, 10));

        // 3. First and Last Occurrence
        int[] repeated = {5, 10, 10, 10, 15, 20, 20, 25};

        System.out.println("First Occurrence of 10: " +
                firstOccurrence(repeated, 10));

        System.out.println("Last Occurrence of 10: " +
                lastOccurrence(repeated, 10));

        // 4. Minimum Element
        System.out.println("Minimum Element: " +
                findMinimum(rotated));
    }
}