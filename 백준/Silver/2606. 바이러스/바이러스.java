import java.util.*;
import java.io.*;

public class Main {
	static int n, m;
	static boolean[] visited;
	static List<List<Integer>> graph;
	static int cnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());

		graph = new ArrayList<>();
		visited = new boolean[n + 1];
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
		bsf(1);
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
		br.close();
	}

	static void bsf(int start){
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		visited[start] = true;

		while(!queue.isEmpty()){
			int now = queue.poll();
			for (int i = 0; i< graph.get(now).size(); i++){
				int next = graph.get(now).get(i);
				if(visited[next]){
					continue;
				}
				cnt++;
				queue.add(next);
				visited[next] = true;

			}
		}

	}

}
