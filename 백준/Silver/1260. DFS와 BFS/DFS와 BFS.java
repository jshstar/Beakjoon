import java.io.*;
import java.util.*;


public class Main {
	static int[][] arr;
	static boolean[] visited;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());

		arr = new int[n + 1][n + 1];
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = 1;
			arr[b][a] = 1;
		}

		visited = new boolean[n + 1];
		dfs(v);
		bw.write("\n");
		visited = new boolean[n + 1];
		bfs(v);

		bw.flush();
		bw.close();
		br.close();
	}

	static void dfs(int v)throws IOException{
		visited[v] = true;
		bw.write(v + " ");
		if(v == arr.length){
			return;
		}
		for(int i = 1; i < arr.length; i++){
			if(arr[v][i] == 1 && !visited[i]){
				dfs(i);
			}
		}
	}

	static void bfs(int v) throws IOException{
		Queue<Integer> queue = new LinkedList<>();
		queue.add(v);
		visited[v] = true;
		bw.write(v + " ");
		while(!queue.isEmpty()){
			int n = queue.poll();
			for (int i = 1; i < arr.length; i++) {
				if(arr[n][i] == 1 && !visited[i]){
					visited[i] = true;
					bw.write(i + " ");
					queue.add(i);
				}
			}
		}

	}
}




