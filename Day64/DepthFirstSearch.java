package Day64;

import java.util.ArrayList;

public class DepthFirstSearch {
      public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean visited[] = new boolean[V];
        ArrayList<Integer> searchResult = new ArrayList<>();
        dfs(0, adj, visited, searchResult);
        return searchResult;
    }
    
    private void dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> sol){
        if(visited[v]){
            return;
        }
        visited[v] = true;
        sol.add(v);
        
        for(int neighbour : adj.get(v)){
            dfs(neighbour, adj,visited,sol);
        }
    }
}
