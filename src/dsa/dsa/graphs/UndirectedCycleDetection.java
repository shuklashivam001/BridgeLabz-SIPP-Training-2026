package dsa.dsa.graphs;

import java.util.*;

public class UndirectedCycleDetection {

    static Map<Integer, List<Integer>> graph = new HashMap<>();

    static void addEdge(int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    static boolean dfsCycleCheck(int node, int parent, Set<Integer> visited) {

        visited.add(node);

        for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {

            if (!visited.contains(neighbor)) {

                if (dfsCycleCheck(neighbor, node, visited))
                    return true;

            } else if (neighbor != parent) {
                return true;
            }
        }

        return false;
    }

    static boolean hasWiringLoop(int n) {

        Set<Integer> visited = new HashSet<>();

        for (int i = 0; i < n; i++) {

            if (!visited.contains(i)) {

                if (dfsCycleCheck(i, -1, visited))
                    return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int n = 5;

        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(2, 3);
        addEdge(3, 0);

        if (hasWiringLoop(n))
            System.out.println("Cycle Detected");
        else
            System.out.println("No Cycle Found");
    }
}