import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Main {
	static int n;
	static boolean[][] visited;
	static int[][] graph;
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static List<Integer> result;
	static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		graph = new int[n][n];
		visited = new boolean[n][n];
		result = new LinkedList<>();
		cnt = 1;
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < n; j++) {
				graph[i][j] = s.charAt(j) - '0';
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (graph[i][j] == 1 && !visited[i][j]) {
					dfs(i, j);
					result.add(cnt);
					cnt = 1;
				}
			}
		}
		Collections.sort(result);
		bw.write(result.size() + "\n");
		for (int r : result) {
			bw.write(r + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}

	static void dfs(int x, int y) {
		visited[x][y] = true;

		for (int i = 0; i < 4; i++) {
			int nx = dx[i] + x;
			int ny = dy[i] + y;
			if (nx >= 0 && ny >= 0 && nx < n && ny < n && !visited[nx][ny] && graph[nx][ny] == 1) {
				cnt++;
				dfs(nx, ny);
			}
		}

	}

}
