package dsa.dsa.hashing;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] words) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : words) {

            char[] ch = word.toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);

            if (!map.containsKey(key))
                map.put(key, new ArrayList<>());

            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(groupAnagrams(words));
    }
}