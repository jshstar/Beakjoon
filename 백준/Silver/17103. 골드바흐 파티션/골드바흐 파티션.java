import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean[] dArr = new boolean[1000001];
		dArr = findDecimal(dArr);
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int cnt = 0;
			for (int j = 2; j <= n/2; j++) {
				if (!dArr[j] && !dArr[n - j]) {
					cnt++;
				}
			}
			bw.write(cnt + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	private static boolean[] findDecimal(boolean[] dArr) {
		dArr[0] = dArr[1] = true;
		for (int i = 2; i * i <= 1000000; i++) {
			if (!dArr[i]) {
				for (int j = i + i; j <= 1000000; j += i) {
					dArr[j] = true;
				}
			}
		}
		return dArr;
	}

}

