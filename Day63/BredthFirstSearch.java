package Day63;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BredthFirstSearch {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfsTraversal = new ArrayList<>();
        boolean[] visited = new boolean[V];
        bfsRecursive(0, adj, visited, bfsTraversal);
        return bfsTraversal;
    }

    private void bfsRecursive(int vertex, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> result) {
        if (visited[vertex]) {
            return;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(vertex);
        visited[vertex] = true;

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            result.add(currentVertex);

            for (int neighbor : adj.get(currentVertex)) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }

        // Explore neighbors of the next unvisited vertex
        for (int nextVertex = 0; nextVertex < adj.size(); nextVertex++) {
            bfsRecursive(nextVertex, adj, visited, result);
        }
    }
}
