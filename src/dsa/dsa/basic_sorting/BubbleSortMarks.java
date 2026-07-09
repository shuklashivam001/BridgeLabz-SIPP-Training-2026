package dsa.dsa.basic_sorting;

public class BubbleSortMarks {

    public static void bubbleSort(int[] marks) {

        int n = marks.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (marks[j] > marks[j + 1]) {

                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {

        int[] marks = {75, 60, 90, 45, 80};

        bubbleSort(marks);

        System.out.println("Sorted Marks:");

        for (int mark : marks)
            System.out.print(mark + " ");
    }
}