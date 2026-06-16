package core_java_practice.core_java_practice.gcr_codebase.methods.Level3;

import java.util.Arrays;

public class FootballTeam {

    public static int findSum(int[] heights) {
        int sum = 0;

        for (int height : heights) {
            sum += height;
        }

        return sum;
    }

    public static double findMeanHeight(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];

        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }

        return shortest;
    }

    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];

        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }

        return tallest;
    }

    public static void main(String[] args) {

        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int)(Math.random() * 101) + 150;
        }

        System.out.println("Player Heights: " + Arrays.toString(heights));
        System.out.println("Mean Height = " + findMeanHeight(heights));
        System.out.println("Shortest Height = " + findShortestHeight(heights));
        System.out.println("Tallest Height = " + findTallestHeight(heights));
    }
}