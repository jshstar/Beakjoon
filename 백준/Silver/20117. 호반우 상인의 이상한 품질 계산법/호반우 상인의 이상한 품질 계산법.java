import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		int sum = 0;

		if (n % 2 == 0) {
			for (int i = n / 2; i < n; i++) {
				sum += arr[i] * 2;
			}
		} else {
			for (int i = n / 2 + 1; i < n; i++) {
				sum += arr[i] * 2;
			}
			sum += arr[n/2];
		}

		bw.write(String.valueOf(sum));

		bw.flush();
		bw.close();
		br.close();
	}

}
