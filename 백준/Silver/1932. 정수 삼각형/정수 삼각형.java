import java.util.*;
import java.io.*;

public class Main {

	static Integer[][] dp;

	static int[][] arr;

	static int n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		dp = new Integer[n][n];
		arr = new int[n][n];
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < i + 1; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < n; i++) {
			dp[n - 1][i] = arr[n - 1][i];
		}

		bw.write(String.valueOf(find(0, 0)));

		bw.flush();
		bw.close();
		br.close();

	}

	static int find(int depth, int idx) {
		if (depth == n - 1) {
			return dp[depth][idx];
		}

		if (dp[depth][idx] == null) {
			return dp[depth][idx] = Math.max(find(depth + 1, idx), find(depth + 1, idx + 1)) + arr[depth][idx];
		}

		return dp[depth][idx];
	}

}


