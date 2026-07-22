package dsa.dsa.graphs;

import java.util.*;

public class AllDeliveryRoutes {

    static Map<Integer, List<Integer>> roads = new HashMap<>();

    static void addRoad(int u, int v) {
        roads.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        roads.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    static void allRoutes(int current,
                          int target,
                          List<Integer> path,
                          Set<Integer> visited,
                          List<List<Integer>> routesList) {

        path.add(current);
        visited.add(current);

        if (current == target) {

            routesList.add(new ArrayList<>(path));

        } else {

            for (int next : roads.getOrDefault(current, Collections.emptyList())) {

                if (!visited.contains(next)) {
                    allRoutes(next, target, path, visited, routesList);
                }
            }
        }

        path.remove(path.size() - 1);
        visited.remove(current);
    }

    public static void main(String[] args) {

        addRoad(0, 1);
        addRoad(0, 2);
        addRoad(1, 3);
        addRoad(2, 3);
        addRoad(3, 4);

        List<List<Integer>> routesList = new ArrayList<>();

        allRoutes(0, 4,
                new ArrayList<>(),
                new HashSet<>(),
                routesList);

        System.out.println("All Routes:");

        for (List<Integer> route : routesList) {
            System.out.println(route);
        }
    }
}