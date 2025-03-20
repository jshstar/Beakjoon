import java.util.*;
import java.io.*;

public class Main {
	static int n, m, cnt;
	static int[][] graph;

	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static ArrayList<Integer> ans;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		graph = new int[m][n];
		ans = new ArrayList<>();

		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			for (int y = y1; y < y2; y++) {
				for (int x = x1; x < x2; x++) {
					graph[y][x] = 1;
				}
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (graph[i][j] == 0) {
					cnt = 1;
					dfs(i, j);
					ans.add(cnt);
				}
			}
		}

		Collections.sort(ans);
		bw.write(ans.size() + "\n");
		for (int i = 0; i < ans.size(); i++) {
			bw.write(ans.get(i) + " ");
		}

		bw.flush();
		bw.close();
		br.close();

	}

	public static void dfs(int y, int x) {
		graph[y][x] = 1;

		for (int i = 0; i < 4; i++) {
			int nx = dx[i] + x;
			int ny = dy[i] + y;

			if (nx >= 0 && nx < n && ny >= 0  && ny < m && graph[ny][nx] == 0) {
				cnt++;
				dfs(ny, nx);
			}
		}

	}

}


