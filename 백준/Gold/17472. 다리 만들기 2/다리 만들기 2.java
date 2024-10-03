import java.io.*;
import java.util.*;

public class Main {
	
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[] parent;
	static int[][] map;
	static int n, m, sNum;
	static boolean[][] visited;
	static ArrayList<ArrayList<int[]>> sumList;
	static ArrayList<int[]> mList;
	static PriorityQueue<Edge> pq;
	
	static class Edge implements Comparable<Edge> {
		int s, e, v;
		
		Edge(int s, int e, int v) {
			this.s = s;
			this.e = e;
			this.v = v;
		}
		
		public int compareTo(Edge o) {
			return this.v - o.v;
		}
	}
	
	static void union(int a, int b) {
		a = find(a);
		b = find(b);
		
		if (a < b) parent[b] = a;
		else parent[a] = b;
	}
	static int find(int a) {
		if (parent[a] == a) return a;
		else return parent[a] = find(parent[a]);
	}
	
	static void BFS(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		mList = new ArrayList<>();
		int[] start = {i, j};
		queue.add(start);
		mList.add(start);
		visited[i][j] = true;
		map[i][j] = sNum;
		
		while (!queue.isEmpty()) {
			int[] now = queue.poll();
			int x = now[0];
			int y = now[1];
			for (int d=0; d<4; d++) {
				int tmpX = dx[d];
				int tmpY = dy[d];
				while (x+tmpX >= 0 && x+tmpX < n && y+tmpY >= 0 && y+tmpY < m) {
					if (visited[x+tmpX][y+tmpY] == false && map[x+tmpX][y+tmpY] != 0) {
						addNode(x+tmpX, y+tmpY, queue);
					}
					else break;
					if (tmpX < 0) tmpX--;
					else if (tmpX > 0) tmpX++;
					else if (tmpY < 0) tmpY--;
					else if (tmpY > 0) tmpY++;
				}
			}
		}
	}
	
	static void addNode(int i, int j, Queue<int[]> queue) {
		map[i][j] = sNum;
		visited[i][j] =true;
		int[] temp = {i, j};
		mList.add(temp);
		queue.add(temp);
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	n = Integer.parseInt(st.nextToken());
    	m = Integer.parseInt(st.nextToken());
    	map = new int[n][m];
    	visited = new boolean[n][m];
    	for (int i=0; i<n; i++) {
    		st = new StringTokenizer(br.readLine());
    		for (int j=0; j<m; j++) map[i][j] = Integer.parseInt(st.nextToken());
    	} sNum = 1;
    	sumList = new ArrayList<>();
    	for (int i=0; i<n; i++) {
    		for (int j=0; j<m; j++) {
    			if (map[i][j] != 0 && !visited[i][j]) {
    				BFS(i, j);
    				sNum++;
    				sumList.add(mList);
    			}
    		}
    	}
    	pq = new PriorityQueue<>();
    	for (int i=0; i<sumList.size(); i++) {
    		ArrayList<int[]> now = sumList.get(i);
    		for (int j=0; j<now.size(); j++) {
    			int x = now.get(j)[0];
    			int y = now.get(j)[1];
    			int now_S = map[x][y];
    			for (int d=0; d<4; d++) {
    				int tmpX = dx[d];
    				int tmpY = dy[d];
    				int blength = 0;
    				while (x+tmpX >= 0 && x+tmpX < n && y+tmpY >= 0 && y+tmpY < m) {
    					if (map[x+tmpX][y+tmpY] == now_S) break;
    					else if (map[x+tmpX][y+tmpY] != 0) {
    						if (blength > 1) {
    							pq.add(new Edge(now_S, map[x+tmpX][y+tmpY], blength));
    						} break;
    					}
    					else blength++;
    					if (tmpX < 0) tmpX--;
    					else if (tmpX > 0) tmpX++;
    					else if (tmpY < 0) tmpY--;
    					else if (tmpY > 0) tmpY++;
    				}
    			}
    		}
    	}
    	parent = new int[sNum];
    	for (int i=0; i<parent.length; i++) parent[i] = i;
    	
    	int useEdge = 0;
    	int result = 0;
    	while (!pq.isEmpty()) {
    		Edge now = pq.poll();
    		if (find(now.s) != find(now.e)) {
    			union(now.s, now.e);
    			result += now.v;
    			useEdge++;
    		}
    	}
    	if (useEdge == sNum-2) System.out.print(result);
    	else System.out.print(-1);
    }
}