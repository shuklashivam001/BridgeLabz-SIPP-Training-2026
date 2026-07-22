package dsa.dsa.heap;

import java.util.Arrays;

public class BuildMinHeap {

    static void buildHeap(int[] priorities) {

        int n = priorities.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            siftDown(priorities, i, n);
        }
    }

    static void siftDown(int[] arr, int index, int size) {

        int smallest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < size && arr[left] < arr[smallest]) {
            smallest = left;
        }

        if (right < size && arr[right] < arr[smallest]) {
            smallest = right;
        }

        if (smallest != index) {

            int temp = arr[index];
            arr[index] = arr[smallest];
            arr[smallest] = temp;

            siftDown(arr, smallest, size);
        }
    }

    public static void main(String[] args) {

        int[] shipmentPriorities = {45, 20, 60, 10, 30, 50, 70};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(shipmentPriorities));

        buildHeap(shipmentPriorities);

        System.out.println("Min Heap:");
        System.out.println(Arrays.toString(shipmentPriorities));
    }
}