import java.util.*;
import java.io.*;

public class Main {
	static int a, b;
	static ArrayList<ArrayList<Integer>> graph;

	static boolean[] visited;

	static int n, m, ans = -1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		graph = new ArrayList<>();
		visited = new boolean[n + 1];
		m = Integer.parseInt(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());

		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<>());
		}

		for (int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			graph.get(num1).add(num2);
			graph.get(num2).add(num1);
		}

		bfs(a, b);

		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
		br.close();

	}

	static void bfs(int start, int end) {
		Queue<Info> q = new LinkedList<>();
		visited[start] = true;
		q.add(new Info(start, 0));
		while (!q.isEmpty()) {
			Info now = q.poll();
			if (now.idx == end) {
				ans = now.cnt;
				break;
			}

			for (int next : graph.get(now.idx)) {
				if (!visited[next]) {
					visited[next] = true;
					q.add(new Info(next, now.cnt + 1));
				}
			}
		}

	}

}

class Info {
	int idx;
	int cnt;

	public Info(int idx, int cnt) {
		this.idx = idx;
		this.cnt = cnt;
	}
}
