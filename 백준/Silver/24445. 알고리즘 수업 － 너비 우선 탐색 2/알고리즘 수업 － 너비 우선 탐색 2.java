import java.util.*;
import java.io.*;

public class Main {
	static int n, m;
	static int[] visited;
	static List<List<Integer>> graph;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		graph = new ArrayList<>();
		visited = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		for (int i = 1; i <= n; i++) {
			graph.get(i).sort(Collections.reverseOrder());
		}
		bsf(r);
		for (int i = 1; i <= n; i++) {
			bw.write(visited[i] + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}

	static void bsf(int start){
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		int cnt = 1;
		visited[start] = cnt++;

		while(!queue.isEmpty()){
			int now = queue.poll();
			for (int i = 0; i< graph.get(now).size(); i++){
				int next = graph.get(now).get(i);
				if(visited[next] != 0){
					continue;
				}
				queue.add(next);
				visited[next] = cnt++;

			}
		}

	}

}
