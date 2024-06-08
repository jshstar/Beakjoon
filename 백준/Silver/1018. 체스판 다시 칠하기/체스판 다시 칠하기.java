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
		String[][] arr = new String[n][m];

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				if (str.charAt(j) == 'W') {
					arr[i][j] = "W";
				} else {
					arr[i][j] = "B";
				}
			}
		}

		int min = 64;

		for (int i = 0; i < n - 7; i++) {
			for (int j = 0; j < m - 7; j++) {
				min = Math.min(min, cal(i, j, arr));
			}
		}

		bw.write(String.valueOf(min));
		br.close();
		bw.flush();
		bw.close();

	}

	public static int cal(int x, int y, String[][] wb) {
		int count = 0;
		String color = "W";

		for (int i = x; i < x + 8; i++) {
			for (int j = y; j < y + 8; j++) {

				if (!wb[i][j].equals(color)) {
					count++;
				}

				if (color.equals("W")) {
					color = "B";
				} else {
					color = "W";
				}
			}
			if (color.equals("W")) {
				color = "B";
			} else {
				color = "W";
			}
		}
		count = Math.min(count, 64 - count);
		return count;
	}
}

