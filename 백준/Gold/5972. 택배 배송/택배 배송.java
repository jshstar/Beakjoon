import java.util.*;
import java.io.*;

public class Main {

	static int n, m;
	static List<ArrayList<Node>> graph;
	static int[] d;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		graph = new ArrayList<>();
		d = new int[50001];
		for (int i = 0; i <= n ;i++) {
			graph.add(new ArrayList<>());
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int node = Integer.parseInt(st.nextToken());
			int nodeB = Integer.parseInt(st.nextToken());
			int distance = Integer.parseInt(st.nextToken());
			graph.get(node).add(new Node(nodeB, distance));
			graph.get(nodeB).add(new Node(node, distance));
		}

		dijkstra(1);
		bw.write(String.valueOf(d[n]));
		bw.flush();
		bw.close();
		br.close();
	}

	static void dijkstra(int start) {
		Arrays.fill(d, Integer.MAX_VALUE);
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(start, 0));
		d[start] = 0;

		while (!pq.isEmpty()) {
			Node temp = pq.poll();
			int nodeB = temp.nodeB;
			int distance = temp.distance;

			if (d[nodeB] < distance) {
				continue;
			}
			for (int i = 0; i < graph.get(nodeB).size(); i++) {
				int cost = d[nodeB] + graph.get(nodeB).get(i).distance;
				if (cost < d[graph.get(nodeB).get(i).nodeB]) {
					d[graph.get(nodeB).get(i).nodeB] = cost;
					pq.add(new Node(graph.get(nodeB).get(i).nodeB, cost));
				}
			}
		}
	}

	static class Node implements Comparable<Node>{
		int nodeB; // 이어진 헛간
		int distance; // 거리

		public Node(int nodeB, int distance) {

			this.nodeB = nodeB;
			this.distance = distance;
		}

		@Override
		public int compareTo(Node other){
			if(this.distance > other.distance){
				return 1;
			} else if(this.distance == other.distance){
				return 0;
			} else {
				return -1;
			}
		}

	}

}
