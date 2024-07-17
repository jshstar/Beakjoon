import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n + 1];
		int max = Integer.MIN_VALUE;
		st =new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= n; i++) {
			arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
		}
		for (int i = k; i <= n; i++) {
			int sum = arr[i] - arr[i - k];
			if(max < sum) {
				max = sum;
			}
		}
		bw.write(String.valueOf(max));
		bw.flush();
		bw.close();
		br.close();
	}
}

