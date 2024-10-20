import java.io.*;
import java.util.*;

public class Main {

	static int n, k;
	static int[] visited;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		visited = new int[100001];
		if (n == k) {
			bw.write(String.valueOf(0));
		} else {
			bfs(n);
		}

		bw.flush();
		bw.close();
		br.close();

	}

	static void bfs(int num) throws IOException{
		Queue<Integer> queue = new LinkedList<>();
		queue.add(num);
		visited[num] = 1;

		while (!queue.isEmpty()) {
			int temp = queue.poll();
			for (int i = 0; i < 3; i++) {
				int next;
				if (i == 0) {
					next = temp + 1;
				} else if (i == 1) {
					next = temp - 1;
				} else {
					next = temp * 2;
				}

				if (next == k) {
					bw.write(String.valueOf(visited[temp]));
					return;
				}
				if(next >= 0 && next < visited.length && visited[next] == 0){
					queue.add(next);
					visited[next] = visited[temp] + 1;
				}
			}

		}
	}

}






