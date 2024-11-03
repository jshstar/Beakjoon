import java.util.*;
import java.io.*;

import org.w3c.dom.Node;

public class Main {

	static List<ArrayList<Integer>> graph;
	static boolean[] visited;
	static int[] result;
	static int n, m, cnt = 1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		graph = new ArrayList<>();
		result = new int[n + 1];
		visited = new boolean[n + 1];
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<>());
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		dfs(r);

		for (int i = 1; i <= n; i++) {
			bw.write(result[i] + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}

	static void dfs(int r) {
		visited[r] = true;
		result[r] = cnt++;
		Collections.sort(graph.get(r), Collections.reverseOrder());
		for (Integer val : graph.get(r)) {
			if (!visited[val]) {
				dfs(val);
			}
		}
		return;
	}

}
