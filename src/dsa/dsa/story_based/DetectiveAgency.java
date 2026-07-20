package dsa.dsa.story_based;

import java.util.*;

public class DetectiveAgency {

    static HashMap<String, List<String>> suspects = new HashMap<>();

    static void addCase(String suspect, String caseName) {
        suspects.putIfAbsent(suspect, new ArrayList<>());
        suspects.get(suspect).add(caseName);
    }

    static String mostInvestigatedSuspect() {
        String name = "";
        int max = 0;

        for (String suspect : suspects.keySet()) {
            int count = suspects.get(suspect).size();

            if (count > max) {
                max = count;
                name = suspect;
            }
        }

        return name;
    }

    static void suspectsInExactlyTwoCases() {
        System.out.println("Suspects in exactly 2 cases:");

        for (String suspect : suspects.keySet()) {
            if (suspects.get(suspect).size() == 2) {
                System.out.println(suspect);
            }
        }
    }

    static void alwaysSeenTogether() {
        System.out.println("Pairs always seen together:");

        List<String> names = new ArrayList<>(suspects.keySet());

        for (int i = 0; i < names.size(); i++) {
            for (int j = i + 1; j < names.size(); j++) {

                List<String> first = suspects.get(names.get(i));
                List<String> second = suspects.get(names.get(j));

                if (first.size() == second.size() && first.containsAll(second)) {
                    System.out.println(names.get(i) + " - " + names.get(j));
                }
            }
        }
    }

    static int subarraySumEqualsK(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {

            sum += num;

            count += map.getOrDefault(sum - k, 0);

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        addCase("John", "Case1");
        addCase("John", "Case2");
        addCase("John", "Case3");

        addCase("Alex", "Case1");
        addCase("Alex", "Case2");

        addCase("Sam", "Case1");
        addCase("Sam", "Case2");

        addCase("David", "Case4");

        System.out.println("Most Investigated Suspect: " + mostInvestigatedSuspect());

        suspectsInExactlyTwoCases();

        alwaysSeenTogether();

        int[] evidence = {1, 2, 3, -2, 2, 1};

        System.out.println("Subarrays with sum 3: " + subarraySumEqualsK(evidence, 3));
    }
}