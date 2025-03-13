import java.util.*;
import java.io.*;

public class Main {

	static int n, m;

	static int[][] map;

	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n][n];
		visited = new boolean[n];
		int cnt = 0;


		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st.nextToken()) - 1;
			int v = Integer.parseInt(st.nextToken()) - 1;
			map[u][v] = 1;
			map[v][u] = 1;
		}

		for (int i = 0; i < n; i++) {
			if(!visited[i]){
				bfs(i);
				cnt++;
			}
		}
		bw.write(String.valueOf(cnt));

		bw.flush();
		bw.close();
		br.close();

	}

	static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visited[start] = true;

		while(!q.isEmpty()){
			int val = q.poll();
			for(int i = 0; i < n; i++){
				if(map[val][i] == 1 && !visited[i]){
					q.add(i);
					visited[i] = true;
				}
			}
		}

	}


}

