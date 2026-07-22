package dsa.dsa.graphs;

import java.util.*;

public class NetworkConnectivity {

    static Map<Integer, List<Integer>> network = new HashMap<>();

    static void addConnection(int u, int v) {
        network.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        network.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    static void dfsMark(int node, Set<Integer> visited) {

        visited.add(node);

        for (int neighbor : network.getOrDefault(node, Collections.emptyList())) {

            if (!visited.contains(neighbor)) {
                dfsMark(neighbor, visited);
            }
        }
    }

    static int countNetworkSegments(int n) {

        Set<Integer> visited = new HashSet<>();
        int segments = 0;

        for (int server = 0; server < n; server++) {

            if (!visited.contains(server)) {
                segments++;
                dfsMark(server, visited);
            }
        }

        return segments;
    }

    public static void main(String[] args) {

        int n = 7;

        addConnection(0, 1);
        addConnection(1, 2);
        addConnection(3, 4);
        addConnection(5, 6);

        int segments = countNetworkSegments(n);

        System.out.println("Connected Components: " + segments);

        if (segments == 1)
            System.out.println("Network is Fully Connected");
        else
            System.out.println("Network is Not Fully Connected");
    }
}