package core_java_practice.core_java_practice.gcr_codebase.recursion;

import java.util.*;

public class Subsets {

    static void subsets(int[] arr, int index, List<Integer> current) {

        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        subsets(arr, index + 1, current);

        current.add(arr[index]);
        subsets(arr, index + 1, current);

        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2};
        subsets(arr, 0, new ArrayList<>());
    }
}