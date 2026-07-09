package dsa.dsa.basic_sorting;

public class SelectionSortScores {

    public static void selectionSort(int[] scores) {

        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {

            int min = i;

            for (int j = i + 1; j < n; j++) {

                if (scores[j] < scores[min])
                    min = j;
            }

            int temp = scores[min];
            scores[min] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] scores = {88, 65, 95, 70, 82};

        selectionSort(scores);

        System.out.println("Sorted Scores:");

        for (int score : scores)
            System.out.print(score + " ");
    }
}