import java.io.*;
import java.util.*;

public class Main {
	static int[][] graph, result;
	static boolean[][] visited;
	static int n, m;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		graph = new int[n][m];
		result = new int[n][m];
		visited = new boolean[n][m];
		int goalX = 0;
		int goalY = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < m; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
				if (graph[i][j] == 2) {
					goalX = i;
					goalY = j;
				} else if (graph[i][j] == 0) {
					visited[i][j] = true;
				}
			}
		}

		bfs(goalX, goalY);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (!visited[i][j]) {
					result[i][j] = -1;
				}
				bw.write(result[i][j] + " ");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[]{x,y});
		visited[x][y] = true;

		while(!queue.isEmpty()){
			int[] temp = queue.poll();
			for (int i = 0; i < 4; i++) {
				int nx = temp[0] + dx[i];
				int ny = temp[1] + dy[i];
				if(nx >= 0 && nx < n && ny >= 0 && ny < m){
					if(!visited[nx][ny] && graph[nx][ny] == 1){
						visited[nx][ny] = true;
						result[nx][ny] = result[temp[0]][temp[1]] + 1;
						queue.add(new int[]{nx, ny});
					}

				}
			}
		}

	}

}




