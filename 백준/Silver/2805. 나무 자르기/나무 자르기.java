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
		int m = Integer.parseInt(st.nextToken());
		int[] tree = new int[n];

		int min = 0;
		int max = 0;

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			tree[i] = Integer.parseInt(st.nextToken());

			if (max < tree[i]) {
				max = tree[i];
			}
		}

		while (min < max) {
			int mid = (min + max) / 2;
			long sum = 0;
			for (int height : tree) {
				if (height - mid > 0) {
					sum += (height - mid);
				}
			}

			if (sum < m) {
				max = mid;
			} else {
				min = mid + 1;
			}
		}

		bw.write(String.valueOf(min - 1));
		bw.flush();
		bw.close();
		br.close();
	}

}

