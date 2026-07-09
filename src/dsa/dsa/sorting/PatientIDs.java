package dsa.dsa.sorting;

import java.util.Scanner;

public class PatientIDs {

    static void sort(int[] arr, int low, int high) {

        if (low < high) {

            int mid = (low + high) / 2;

            sort(arr, low, mid);
            sort(arr, mid + 1, high);

            merge(arr, low, mid, high);
        }
    }

    static void merge(int[] arr, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int index = 0;

        while (i <= mid && j <= high) {

            if (arr[i] <= arr[j])
                temp[index++] = arr[i++];
            else
                temp[index++] = arr[j++];
        }

        while (i <= mid)
            temp[index++] = arr[i++];

        while (j <= high)
            temp[index++] = arr[j++];

        for (i = 0; i < temp.length; i++)
            arr[low + i] = temp[i];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] ids = new int[n];

        for (int i = 0; i < n; i++)
            ids[i] = sc.nextInt();

        sort(ids, 0, n - 1);

        for (int id : ids)
            System.out.print(id + " ");

        sc.close();
    }
}