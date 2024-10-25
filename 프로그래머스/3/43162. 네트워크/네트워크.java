import java.util.*;

class Solution {
    
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int count = 0;
    
    static void dfs(int start) {
        
        if (visited[start]) return;
        visited[start] = true;
        
        ArrayList<Integer> neighbors = graph[start];
        for (int neighbor : neighbors) if (!visited[neighbor]) dfs(neighbor);
        
    }
    
    public int solution(int n, int[][] computers) {
        
        graph = new ArrayList[n];
        for (int i=0; i<graph.length; i++) graph[i] = new ArrayList<>();
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (i != j && computers[i][j] != 0) graph[i].add(j);
            }
        }
        
        visited = new boolean[n];
        for (int i=0; i<computers.length; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }
        
        return count;
        
    }
}