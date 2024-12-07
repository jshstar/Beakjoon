import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Main {
	static int t, n, m, k;
	static boolean[][] visited;
	static int[][] graph;
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int c = 0; c < t; c++) {
			cnt = 0;
			st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());

			graph = new int[n][m];
			visited = new boolean[n][m];

			for (int i = 0; i < k; i++) {
				st = new StringTokenizer(br.readLine());
				int pX = Integer.parseInt(st.nextToken());
				int pY = Integer.parseInt(st.nextToken());
				graph[pY][pX] = 1;
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (graph[i][j] == 1 && !visited[i][j]) {
						bsf(j, i);
						cnt++;
					}
				}
			}
			bw.write(cnt + "\n");
		}



		bw.flush();
		bw.close();
		br.close();
	}

	static void bsf(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x, y});
		visited[y][x] = true;

		while (!q.isEmpty()) {
			int[] arr = q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = dx[i] + arr[0];
				int ny = dy[i] + arr[1];
				if (nx >= 0 && ny >= 0 && nx < m && ny < n && !visited[ny][nx] && graph[ny][nx] == 1) {
					q.add(new int[] {nx, ny});
					visited[ny][nx] = true;
				}
			}
		}

	}

}
