import java.io.*;
import java.util.*;

public class Main {

	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};
	static boolean[][] visited;
	static int[][] nm;
	static int n, m;
	
	static void bfs(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {i, j});
		visited[i][j] = true;
		while (!queue.isEmpty()) {
			int[] now = queue.poll();
			for (int k=0; k<4; k++) {
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				if (x >= 0 && y >= 0 && x<n && y<m) {
					if (nm[x][y] != 0 && !visited[x][y]) {
						visited[x][y] = true;
						nm[x][y] = nm[now[0]][now[1]] + 1;
						queue.add(new int[] {x, y});
					}
				}
				
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); m = Integer.parseInt(st.nextToken());
		nm = new int[n][m];
		visited = new boolean[n][m];
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for (int j=0; j<m; j++) nm[i][j] = Integer.parseInt(line.substring(j, j+1));
		} bfs(0, 0);
		System.out.print(nm[n-1][m-1]);
	}
	
}