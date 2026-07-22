package dsa.dsa.graphs;

import java.util.*;

public class DirectedCycleDetection {

    static Map<Integer, List<Integer>> graph = new HashMap<>();

    static void addEdge(int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
    }

    static boolean dfsCycleCheck(int node, int[] state) {

        state[node] = 1;

        for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {

            if (state[neighbor] == 1)
                return true;

            if (state[neighbor] == 0) {

                if (dfsCycleCheck(neighbor, state))
                    return true;
            }
        }

        state[node] = 2;
        return false;
    }

    static boolean hasCircularDependency(int n) {

        int[] state = new int[n];

        for (int i = 0; i < n; i++) {

            if (state[i] == 0) {

                if (dfsCycleCheck(i, state))
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
        addEdge(3, 1);

        if (hasCircularDependency(n))
            System.out.println("Cycle Detected");
        else
            System.out.println("No Cycle Found");
    }
}