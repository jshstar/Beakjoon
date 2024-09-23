import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int[] budgetArr = new int[n];
		int left = 0, right = -1;

		for (int i = 0; i < n; i++) {
			budgetArr[i] = Integer.parseInt(st.nextToken());
			right = Math.max(right, budgetArr[i]);
		}

		while (left <= right) {
			int mid = (left + right) / 2;
			long budget = 0;
			for (int i = 0; i < n; i++) {
				if (budgetArr[i] > mid) {
					budget += mid;
				} else {
					budget += budgetArr[i];
				}
			}
			if (budget <= m) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}
		bw.write(right + "\n");

		bw.flush();
		bw.close();
		br.close();
	}

}


