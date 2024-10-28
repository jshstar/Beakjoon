import java.util.*;
import java.io.*;

public class Main {
	static boolean[] visited;
	static int n, m;

	static int[] cnt;

	static int[] upOrDown;

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		visited = new boolean[101];
		cnt = new int[101];
		upOrDown = new int[101];
		int a;
		int b;
		for (int i = 0; i < n + m; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			upOrDown[a] = b;
		}

		bfs(1);
		bw.flush();
		bw.close();
		br.close();
	}

	static void bfs(int num) throws IOException{
		Queue<Integer> q = new LinkedList<>();
		q.add(num);
		cnt[num] = 0;
		visited[num] = true;

		while (!q.isEmpty()) {
			int temp = q.poll();
			if(temp == 100){
				bw.write(String.valueOf(cnt[100]));
				return;
			}

			for (int i = 1; i <= 6; i++) {
				int next = temp + i;
				if(100 < next){
					continue;
				}
				if(visited[next]){
					continue;
				}
				visited[next] = true;

				if(upOrDown[next] != 0){
					if(!visited[upOrDown[next]]){
						q.add(upOrDown[next]);
						visited[upOrDown[next]] = true;
						cnt[upOrDown[next]] = cnt[temp] + 1;
					}
				} else{
					q.add(next);
					cnt[next] = cnt[temp] + 1;
				}
			}
		}
	}
}
