import java.util.*;
import java.io.*;

public class Main {

	static List<ArrayList<Integer>> graph;
	static int n;

	static int[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			graph.add(new ArrayList<>());
		}

		arr = new int[n][n];
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < n; j++) {
				int k = Integer.parseInt(st.nextToken());
				if (k == 1) {
					graph.get(i).add(j);
				}
			}
		}
		for (int i = 0; i < n; i++) {
			bfs(i);
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				bw.write(arr[i][j] + " ");
			}
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();

	}

	static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		boolean[] visited = new boolean[n];
		while (!q.isEmpty()) {
			int now = q.poll();

			for (int next : graph.get(now)) {
				if (!visited[next]) {
					visited[next] = true;
					arr[start][next] = 1;
					q.add(next);
				}
			}

		}

	}
}


