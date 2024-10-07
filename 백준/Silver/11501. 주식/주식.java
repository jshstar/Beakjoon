import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] stoke;
		for (int i = 0; i < t; i++) {

			int n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			stoke = new int[n];
			int max = Integer.MIN_VALUE;
			long result = 0;

			for (int j = 0; j < n; j++) {
				stoke[j] = Integer.parseInt(st.nextToken());
			}
			for (int j = n - 1; j >= 0; j--) {
				if (max < stoke[j]) {
					max = stoke[j];
				} 
				result += max - stoke[j];
			}
			bw.write(result + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}

}