import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}

		boolean flag = false;
		int start = 0;
		int end = n - 1;
		long min = Long.MAX_VALUE;
		int tStart = 0, tEnd = 0;
		while (start < end) {
			long sum = arr[start] + arr[end];

			if (min > Math.abs(sum)) {
				min = Math.abs(sum);
				tStart = start;
				tEnd = end;
			}

			if (sum >= 0) {
				end--;
			} else {
				start++;
			}
		}

		bw.write(arr[tStart] + " " + arr[tEnd]);

		bw.flush();
		bw.close();
		br.close();
	}

}
