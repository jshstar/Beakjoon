import java.util.*;
import java.io.*;

public class Main {

	static char[][] map;
	static int n, m, cnt;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());


		map = new char[m][n];
		visited = new boolean[m][n];

		for (int i = 0; i < m; i++) {
			String s = br.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = s.charAt(j);
			}
		}

		int wSum = 0, bSum = 0;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (!visited[i][j]) {
					cnt = 0;
					bfs(i, j);
					if (map[i][j] == 'W') {
						wSum += cnt * cnt;
					} else {
						bSum += cnt * cnt;
					}
				}
			}
		}

		bw.write(wSum + " " + bSum + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	static void bfs(int y, int x) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {y, x});
		visited[y][x] = true;
		char color = map[y][x];
		cnt = 1;

		while (!q.isEmpty()) {
			int[] arr = q.poll();

			for (int i = 0; i < 4; i++) {
				int ny = arr[0] + dy[i];
				int nx = arr[1] + dx[i];

				if (ny >= 0 && ny < m && nx >= 0 && nx < n && !visited[ny][nx]) {
					if (map[ny][nx] == color) {
						cnt++;
						q.add(new int[] {ny, nx});
						visited[ny][nx] = true;
					}
				}
			}
		}
	}
}
