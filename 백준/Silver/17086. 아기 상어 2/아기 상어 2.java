import java.util.*;
import java.io.*;

import javax.swing.text.Position;

public class Main {
	static int n, m;
	static int[][] graph;

	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
	static int[] dy = {0, 0, -1, 1, -1, 1, 1, -1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		graph = new int[n][m];
		int ans = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (graph[i][j] == 0) {
					ans = Math.max(ans, bfs(i, j));
				}
			}
		}

		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
		br.close();

	}

	public static int bfs(int x, int y) {
		visited = new boolean[n][m];
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x, y, 0});
		visited[x][y] = true;

		while (!q.isEmpty()) {
			int[] now = q.poll();
			if(graph[now[0]][now[1]] == 1){
				return now[2];
			}

			for (int i = 0; i < 8; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				int val = now[2] + 1;
				if (nx >= 0 && ny >= 0 && nx < n && ny < m && !visited[nx][ny]) {
					visited[nx][ny] = true;
					q.add(new int[] {nx, ny, val});
				}
			}
		}
		return -1;
	}

}



