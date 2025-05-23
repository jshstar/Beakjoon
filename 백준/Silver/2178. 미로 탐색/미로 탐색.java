import java.util.*;
import java.io.*;

public class Main {

	static int cnt = 1;
	static int[][] graph;
	static boolean[][] visited;
	static int n, m;

	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		graph = new int[n][m];
		visited = new boolean[n][m];
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < m; j++) {
				graph[i][j] = s.charAt(j) - '0';
			}
		}

		bfs();

		bw.write(String.valueOf(graph[n - 1][m - 1]));

		bw.flush();
		bw.close();
		br.close();
	}

	static void bfs() {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {0, 0});

		while (!q.isEmpty()) {
			int[] arr = q.poll();

			for (int i = 0; i < 4; i++) {
				int ny = dy[i] + arr[0];
				int nx = dx[i] + arr[1];
				
                if (nx < 0 || ny < 0 || ny >= n || nx >= m) {
					continue;
				}
				if (graph[ny][nx] == 0) {
					continue;
				}
				if (visited[ny][nx]) {
					continue;
				}
                
				q.add(new int[] {ny, nx});
				visited[ny][nx] = true;
				graph[ny][nx] = graph[arr[0]][arr[1]] + 1;

			}
		}
	}
}
