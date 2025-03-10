import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int n;
	static char[][] map;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());

		map = new char[n][n];

		visited = new boolean[n][n];

		int normal = 0;

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = s.charAt(j);
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!visited[i][j]) {
					bfs(i, j);
					normal++;
				}
			}
		}


		int abnormal = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(map[i][j] == 'G'){
					map[i][j] = 'R';
				}
			}
		}

		visited = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!visited[i][j]) {
					bfs(i, j);
					abnormal++;
				}
			}
		}

		bw.write(normal + " " + abnormal);

		bw.flush();
		bw.close();
		br.close();

	}

	static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		visited[x][y] = true;
		q.add(new int[] {x, y});
		char color = map[x][y];

		while (!q.isEmpty()) {
			int[] arr = q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = arr[0] + dx[i];
				int ny = arr[1] + dy[i];
				if (nx >= 0 && nx < n && ny < n && ny >= 0 && !visited[nx][ny]) {
					if (map[nx][ny] == color) {
						visited[nx][ny] = true;
						q.add(new int[] {nx, ny});
					}
				}
			}
		}
	}

}


