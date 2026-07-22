package dsa.dsa.heap;

import java.util.Arrays;

public class HeapSortSensorReading {

    static void heapSort(int[] readings) {

        int n = readings.length;

        // Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(readings, n, i);
        }

        // Heap Sort
        for (int i = n - 1; i > 0; i--) {

            int temp = readings[0];
            readings[0] = readings[i];
            readings[i] = temp;

            heapify(readings, i, 0);
        }
    }

    static void heapify(int[] arr, int size, int root) {

        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;

        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != root) {

            int temp = arr[root];
            arr[root] = arr[largest];
            arr[largest] = temp;

            heapify(arr, size, largest);
        }
    }

    public static void main(String[] args) {

        int[] sensorReadings = {18, 5, 30, 12, 7, 25, 40, 15};

        System.out.println("Original Readings:");
        System.out.println(Arrays.toString(sensorReadings));

        heapSort(sensorReadings);

        System.out.println("Sorted Readings:");
        System.out.println(Arrays.toString(sensorReadings));
    }
}