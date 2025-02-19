import java.util.*;
import java.io.*;

public class Main {

	static Integer dp[];
	static int arr[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		dp = new Integer[n + 1];
		arr = new int[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		dp[0] = arr[0];
		dp[1] = arr[1];

		if(n >= 2) {
			dp[2] = arr[1] + arr[2];
		}

		bw.write(String.valueOf(find(n)));

		bw.flush();
		bw.close();
		br.close();

	}

	static int find(int N) {
		if(dp[N] == null) {
			dp[N] = Math.max(find(N - 2), find(N - 3) + arr[N - 1]) + arr[N];
		}

		return dp[N];
	}

}


