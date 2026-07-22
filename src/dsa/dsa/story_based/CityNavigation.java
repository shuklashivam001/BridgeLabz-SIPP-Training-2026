package dsa.dsa.story_based;

import java.util.*;

public class CityNavigation {

    static final int V = 10;

    static ArrayList<Integer>[] graph = new ArrayList[V];
    static ArrayList<Integer>[] directedGraph = new ArrayList[V];

    static {
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
            directedGraph[i] = new ArrayList<>();
        }
    }

    static void addEdge(int u, int v) {
        graph[u].add(v);
        graph[v].add(u);
    }

    static void addDirectedEdge(int u, int v) {
        directedGraph[u].add(v);
    }

    static void bfsShortestPath(int source, int destination) {

        boolean[] visited = new boolean[V];
        int[] parent = new int[V];

        Arrays.fill(parent, -1);

        Queue<Integer> queue = new LinkedList<>();

        visited[source] = true;
        queue.offer(source);

        while (!queue.isEmpty()) {

            int current = queue.poll();

            if (current == destination)
                break;

            for (int neighbor : graph[current]) {

                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    parent[neighbor] = current;
                    queue.offer(neighbor);
                }
            }
        }

        if (!visited[destination]) {
            System.out.println("No Path Exists");
            return;
        }

        List<Integer> path = new ArrayList<>();

        for (int i = destination; i != -1; i = parent[i])
            path.add(i);

        Collections.reverse(path);

        System.out.println("Shortest Path (BFS): " + path);
    }

    static void printAllPaths(int source, int destination) {

        boolean[] visited = new boolean[V];
        ArrayList<Integer> path = new ArrayList<>();

        System.out.println("All Paths (DFS):");
        dfs(source, destination, visited, path);
    }

    static void dfs(int current, int destination,
                    boolean[] visited,
                    ArrayList<Integer> path) {

        visited[current] = true;
        path.add(current);

        if (current == destination) {
            System.out.println(path);
        } else {

            for (int neighbor : graph[current]) {

                if (!visited[neighbor]) {
                    dfs(neighbor, destination, visited, path);
                }
            }
        }

        path.remove(path.size() - 1);
        visited[current] = false;
    }

    static void connectedComponents() {

        boolean[] visited = new boolean[V];
        int component = 1;

        System.out.println("\nConnected Components:");

        for (int i = 0; i < V; i++) {

            if (!visited[i]) {

                System.out.print("Component " + component + ": ");
                dfsComponent(i, visited);
                System.out.println();

                component++;
            }
        }
    }

    static void dfsComponent(int node, boolean[] visited) {

        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : graph[node]) {

            if (!visited[neighbor]) {
                dfsComponent(neighbor, visited);
            }
        }
    }

    static boolean hasCycle() {

        boolean[] visited = new boolean[V];
        boolean[] recursionStack = new boolean[V];

        for (int i = 0; i < V; i++) {

            if (!visited[i]) {

                if (detectCycle(i, visited, recursionStack))
                    return true;
            }
        }

        return false;
    }

    static boolean detectCycle(int node,
                               boolean[] visited,
                               boolean[] recursionStack) {

        visited[node] = true;
        recursionStack[node] = true;

        for (int neighbor : directedGraph[node]) {

            if (!visited[neighbor]) {

                if (detectCycle(neighbor, visited, recursionStack))
                    return true;

            } else if (recursionStack[neighbor]) {
                return true;
            }
        }

        recursionStack[node] = false;
        return false;
    }

    public static void main(String[] args) {

        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 3);
        addEdge(2, 3);
        addEdge(3, 4);
        addEdge(4, 5);
        addEdge(6, 7);
        addEdge(7, 8);
        addEdge(8, 9);

        bfsShortestPath(0, 5);
        System.out.println();

        printAllPaths(0, 5);
        System.out.println();

        connectedComponents();
        System.out.println();

        addDirectedEdge(0, 1);
        addDirectedEdge(1, 2);
        addDirectedEdge(2, 3);
        addDirectedEdge(3, 1);

        if (hasCycle())
            System.out.println("Cycle Detected in Directed Graph");
        else
            System.out.println("No Cycle Found");
    }
}