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
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int[] lanArr = new int[k];
		long max = 0;
		for (int i = 0; i < k; i++) {
			lanArr[i] = Integer.parseInt(br.readLine());
			if (max < lanArr[i]) {
				max = lanArr[i];
			}
		}

		max++;
		long min = 0;
		long mid = 0;

		while (min < max) {
			mid = (max + min) / 2;
			long cnt = 0;

			for (int i = 0; i < lanArr.length; i++) {
				cnt += (lanArr[i] / mid);
			}

			if (cnt < n) {
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

