import java.io.*;
import java.util.*;

public class Main {
	static int n;
	static int k;
	static boolean[] visited;
	public static int result = Integer.MAX_VALUE;
	public static Queue<Node> q = new LinkedList<>();
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		visited = new boolean[100001];
		
		bfs();
		
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();

	}

	static void bfs() {
		q.offer(new Node(n,0));
		while(!q.isEmpty()) {
			Node node = q.poll();
			int x = node.x;
			int time = node.time;
			visited[x]= true;

			if(x == k) result = Math.min(result,  time);

			if(x * 2 <= 100000 && visited[x * 2] == false) q.offer(new Node(x * 2, time));
			if(x + 1 <= 100000 && visited[x + 1] == false) q.offer(new Node(x + 1, time + 1));
			if(x - 1 >= 0 && visited[x - 1] == false) q.offer(new Node(x - 1, time + 1));
		}

	}
	static class Node{
		int x;
		int time;
		public Node(int x , int time) {
			this.x=x;
			this.time = time;
		}
	}

}






