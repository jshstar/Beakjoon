import java.util.*;
import java.io.*;

public class Main {

	static int i;
	static int x1, y1, x2, y2;

	static int[][] map;

	static boolean[][] visited;
	static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
	static int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		for (int k = 1; k <= n; k++) {
			i = Integer.parseInt(br.readLine());
			map = new int[i][i];

			visited = new boolean[i][i];

			st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			bfs();
			bw.write(map[x2][y2] + "\n");

		}


		bw.flush();
		bw.close();
		br.close();

	}

	static void bfs() {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[]{x1, y1});
		visited[x1][y1] = true;

		while(!q.isEmpty()){
			int[] arr = q.poll();
			int nx = arr[0];
			int ny = arr[1];
			for(int k = 0; k < 8; k++){
				int nextX = nx + dx[k];
				int nextY = ny + dy[k];

				if (nextX >= 0 && nextY >= 0 && nextX < i && nextY < i) {
					if (!visited[nextX][nextY]) {
						q.add(new int[]{nextX, nextY});
						map[nextX][nextY] = map[nx][ny] + 1;
						visited[nextX][nextY] = true;
					}
				}
			}
		}

	}


}

