import java.util.*;
import java.io.*;

public class Main {
	static boolean[] visited;
	static ArrayList<Integer> list;
	static int[] arr;
	static int n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n =  Integer.parseInt(br.readLine());
		visited = new boolean[n + 1];
		arr = new int[n + 1];
		list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 1; i <= n; i++) {
			visited[i] = true;
			dfs(i, i);
			visited[i] = false;
		}

		Collections.sort(list);
		bw.write(String.valueOf(list.size())+ "\n");
		for(int i=0; i<list.size(); i++) {
			bw.write(String.valueOf(list.get(i)) + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}

	static void dfs(int start, int target) {
		if (!visited[arr[start]]) {
			visited[arr[start]] = true;
			dfs(arr[start], target);
			visited[arr[start]] = false;
		}

		if(arr[start] == target){
			list.add(target);
		}

	}

}
