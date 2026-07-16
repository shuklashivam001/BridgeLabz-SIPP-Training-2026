package dsa.dsa.two_pointer_sliding_window;

import java.util.*;

public class LongestSubarrayWithAtMostNDistinct {

    public static int longestSubarrayWithAtMostNDistinct(int[] keyIds, int n) {

        Map<Integer, Integer> freq = new HashMap<>();

        int start = 0;
        int maxLen = 0;

        for (int end = 0; end < keyIds.length; end++) {

            freq.put(keyIds[end], freq.getOrDefault(keyIds[end], 0) + 1);

            while (freq.size() > n) {

                int left = keyIds[start];

                freq.put(left, freq.get(left) - 1);

                if (freq.get(left) == 0) {
                    freq.remove(left);
                }

                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] keyIds = {1, 2, 1, 2, 3, 2, 2};

        System.out.println(longestSubarrayWithAtMostNDistinct(keyIds, 2));
    }
}