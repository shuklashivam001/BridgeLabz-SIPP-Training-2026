package dsa.dsa.story_based;

public class SportsMeet {

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int swaps = 0;
        boolean alreadySorted = true;

        System.out.println("Bubble Sort Passes:");

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaps++;
                    swapped = true;
                }
            }

            System.out.print("Pass " + (i + 1) + ": ");
            printArray(arr);

            if (!swapped) {
                break;
            }

            alreadySorted = false;
        }

        System.out.println("Total Swaps = " + swaps);

        if (alreadySorted)
            System.out.println("Array was already sorted (Best Case).");
        else
            System.out.println("Array was not initially sorted.");
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        System.out.println("\nInsertion Sort Passes:");

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            System.out.print("Pass " + i + ": ");
            printArray(arr);
        }
    }

    // Print Array
    public static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    // Top 3 Medalists
    public static void top3(int[] arr) {
        int n = arr.length;

        System.out.println("\nTop 3 Medalists:");
        System.out.println("Gold   : " + arr[n - 1]);
        System.out.println("Silver : " + arr[n - 2]);
        System.out.println("Bronze : " + arr[n - 3]);
    }

    public static void main(String[] args) {

        int[] scores = {64, 25, 12, 22, 11};

        int[] bubbleArray = scores.clone();
        int[] insertionArray = scores.clone();

        bubbleSort(bubbleArray);

        insertionSort(insertionArray);

        top3(insertionArray);
    }
}