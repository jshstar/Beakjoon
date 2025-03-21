import java.util.*;
import java.io.*;

public class Main {
	static int n;
	static int[][] graph;

	static boolean[][] visited;
	static int[][] count;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		graph = new int[n][n];
		int maxNum = 0;
		int result = 0;
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				int num = Integer.parseInt(st.nextToken());
				graph[i][j] = num;
				maxNum = Math.max(maxNum, num);
			}
		}

		for (int i = 0; i < maxNum; i++) {
			visited = new boolean[n][n];
			cnt = 0;
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					if (!visited[j][k] && graph[j][k] > i) {
						bfs(j, k, i);
						cnt++;
					}
				}
			}
			result = Math.max(cnt, result);
		}

		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();

	}

	public static void bfs(int x, int y, int height) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x, y});
		visited[x][y] = true;

		while (!q.isEmpty()) {
			int[] now = q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
					if (!visited[nx][ny] && graph[nx][ny] > height) {
						visited[nx][ny] = true;
						q.add(new int[] {nx, ny});
					}
				}
			}
		}
	}
}



