import java.util.*;
import java.io.*;

import javax.management.StringValueExp;

public class Main {

	static Integer[]dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		dp = new Integer[n + 1];
		dp[0] = 1;
		dp[1] = 1;

		bw.write(String.valueOf(find(n)));



		bw.flush();
		bw.close();
		br.close();

	}

	static int find(int n) {
		if(dp[n] == null){
			dp[n] = (find(n - 1) + find(n - 2)) % 10007;
		}

		return dp[n];
	}

}


