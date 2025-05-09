import java.util.*;
import java.io.*;

public class Main {

	static int[] arr;
	static int n, m;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[m];
		dfs(1, 0);
        
		br.close();
	}

	public static void dfs(int at, int depth) {

		if (depth == m) {
			for (int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}

		for (int i = at; i <= n; i++) {

			arr[depth] = i;
			dfs(i + 1, depth + 1);

		}
	}
}
