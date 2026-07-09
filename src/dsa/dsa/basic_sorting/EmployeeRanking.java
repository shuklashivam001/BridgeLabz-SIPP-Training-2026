package dsa.dsa.basic_sorting;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeRanking {

    public static void main(String[] args) {

        int[] employeeIds = {101, 102, 103, 104, 105};
        int[] attendance = {92, 85, 98, 92, 80};

        int k = 3;

        Integer[] index = new Integer[employeeIds.length];

        for (int i = 0; i < employeeIds.length; i++)
            index[i] = i;

        Arrays.sort(index, new Comparator<Integer>() {

            @Override
            public int compare(Integer a, Integer b) {

                if (attendance[a] != attendance[b])
                    return attendance[b] - attendance[a];

                return employeeIds[a] - employeeIds[b];
            }
        });

        System.out.println("Top " + k + " Employees:");

        for (int i = 0; i < k; i++)
            System.out.print(employeeIds[index[i]] + " ");
    }
}