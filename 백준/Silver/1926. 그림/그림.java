import java.util.*;
import java.io.*;

public class Main {
	static int[][] graph;
	static boolean[][] visited;
	static int n, m, cnt = 0;

	static int[][] pos = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		graph = new int[n][m];
		visited = new boolean[n][m];
		boolean zero = true;
		List<Integer> answer = new ArrayList<>();
		int max = 0;
		int mapCnt = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
				if (graph[i][j] == 1) {
					zero = false;
				}
			}
		}
		if (zero) {
			bw.write(0 + "\n");
			bw.write(0 + "\n");
		} else {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					cnt = 0;
					if (graph[i][j] == 1 && !visited[i][j]) {
						cnt++;
						bfs(i, j);
						mapCnt++;
						max = Math.max(max, cnt);
					}
				}
			}
			bw.write(mapCnt + "\n");
			bw.write(max + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}

	static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x, y});
		visited[x][y] = true;

		while (!q.isEmpty()) {
			int[] arr = q.poll();
			int nowX = arr[0];
			int nowY = arr[1];

			for (int i = 0; i < pos.length; i++) {
				int nx = nowX + pos[i][0];
				int ny = nowY + pos[i][1];

				if (nx >= 0 && nx < n && ny >= 0 && ny < m && graph[nx][ny] == 1 && !visited[nx][ny]) {
					cnt++;
					visited[nx][ny] = true;
					q.add(new int[] {nx, ny});
				}
			}
		}
	}
}
