package dsa.dsa.graphs;

import java.util.*;

public class ShortestFlightPath {

    static Map<Integer, List<Integer>> routes = new HashMap<>();

    static void addRoute(int u, int v) {
        routes.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        routes.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    static List<Integer> fewestFlights(int origin, int destination) {

        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> parent = new HashMap<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(origin);
        visited.add(origin);
        parent.put(origin, null);

        while (!queue.isEmpty()) {

            int city = queue.poll();

            if (city == destination)
                break;

            for (int next : routes.getOrDefault(city, Collections.emptyList())) {

                if (!visited.contains(next)) {
                    visited.add(next);
                    parent.put(next, city);
                    queue.offer(next);
                }
            }
        }

        if (!visited.contains(destination))
            return Collections.emptyList();

        LinkedList<Integer> path = new LinkedList<>();

        Integer node = destination;

        while (node != null) {
            path.addFirst(node);
            node = parent.get(node);
        }

        return path;
    }

    public static void main(String[] args) {

        addRoute(0, 1);
        addRoute(0, 2);
        addRoute(1, 3);
        addRoute(2, 4);
        addRoute(3, 5);
        addRoute(4, 5);

        System.out.println("Shortest Path:");
        System.out.println(fewestFlights(0, 5));
    }
}