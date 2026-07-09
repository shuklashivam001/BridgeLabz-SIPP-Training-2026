package dsa.dsa.story_based;

import java.util.Arrays;
import java.util.Random;

public class LibrarySorting {

    // ---------------- Merge Sort ----------------
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    // ---------------- Quick Sort (Lomuto Partition) ----------------

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);

            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // ---------------- Counting Sort ----------------

    static void countingSort(int[] arr, int maxValue) {

        int[] count = new int[maxValue + 1];

        for (int num : arr)
            count[num]++;

        int index = 0;

        for (int i = 1; i <= maxValue; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    // ---------------- Runtime Comparison ----------------

    static void testSorting(int size) {

        Random rand = new Random();

        int[] original = new int[size];

        for (int i = 0; i < size; i++)
            original[i] = rand.nextInt(20) + 1;

        int[] merge = original.clone();
        int[] quick = original.clone();
        int[] count = original.clone();

        long start, end;

        start = System.nanoTime();
        mergeSort(merge, 0, merge.length - 1);
        end = System.nanoTime();
        System.out.println("Merge Sort (" + size + ") : " + (end - start) + " ns");

        start = System.nanoTime();
        quickSort(quick, 0, quick.length - 1);
        end = System.nanoTime();
        System.out.println("Quick Sort (" + size + ") : " + (end - start) + " ns");

        start = System.nanoTime();
        countingSort(count, 20);
        end = System.nanoTime();
        System.out.println("Counting Sort (" + size + ") : " + (end - start) + " ns");

        System.out.println();
    }

    public static void main(String[] args) {

        int[] books = {2018, 2005, 2022, 1999, 2015, 2020};

        System.out.println("Original Book Years:");
        System.out.println(Arrays.toString(books));

        mergeSort(books, 0, books.length - 1);

        System.out.println("After Merge Sort:");
        System.out.println(Arrays.toString(books));

        System.out.println("\nRuntime Comparison");
        testSorting(100);
        testSorting(1000);
        testSorting(10000);
    }
}