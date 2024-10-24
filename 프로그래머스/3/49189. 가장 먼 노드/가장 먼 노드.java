import java.util.*;

class Solution {
    
    static int result = 0;
    
    static class Node {
        
        int no, depth;
        
        Node(int no, int depth) {
            this.no = no;
            this.depth = depth;
        }
        
    }
    
    static int bfs(int start, ArrayList<Node>[] graph, int dep) {
        
        boolean[] visited = new boolean[graph.length];
        Queue<Node> queue = new LinkedList<>();
        
        queue.add(new Node(start, dep));
        visited[start] = true;
        
        int count = 0;
        int maxDepth = 0;
        
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            
            if (node.depth > maxDepth) {
                maxDepth = node.depth;
                count = 1;
            } else if (node.depth == maxDepth) count++;
            
            ArrayList<Node> neighbors = graph[node.no];
            if (node.depth > result) result = node.depth;
            for (Node neighbor : neighbors) {
                if (!visited[neighbor.no]) {
                    queue.add(new Node(neighbor.no, node.depth + 1));
                    visited[neighbor.no] = true;
                }
            }
        }
        
        return count;
        
    }
    
    public int solution(int n, int[][] edge) {
        
        int max = 0;
        for (int[] e : edge) {
            if (e[0] > max) max = e[0];
            if (e[1] > max) max = e[1];
        }
        
        ArrayList<Node>[] graph = new ArrayList[max+1];
        for (int i=0; i<graph.length; i++) graph[i] = new ArrayList<>();
        for (int[] e : edge) {
            graph[e[0]].add(new Node(e[1], 1));
            graph[e[1]].add(new Node(e[0], 1));
        }
        
        return bfs(1, graph, 1);
        
    }
}