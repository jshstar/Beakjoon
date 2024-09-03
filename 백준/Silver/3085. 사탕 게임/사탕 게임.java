import java.io.*;
import java.util.Arrays;

public class Main {

	static char[][] candy;
	static int n, max = 1;

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		candy = new char[n][n];
		for (int i = 0; i < n; i++) {
			candy[i] = br.readLine().toCharArray();
		}
		searchRow();
		searchCol();
		bw.write(max + "\n");
		bw.flush();
		br.close();
		bw.close();


	}

	static void searchRow() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				swap(i, j, i, j + 1);
				rowCheck();
				colCheck();
				swap(i, j + 1, i, j);
			}
		}
	}

	static void searchCol() {
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n; j++) {
				swap(i, j, i + 1, j);
				rowCheck();
				colCheck();
				swap(i + 1, j, i, j);
			}
		}
	}

	static void rowCheck() {
		for (int i = 0; i < n; i++) {
			int cnt = 1;
			for (int j = 0; j < n - 1; j++) {
				if (candy[i][j] == candy[i][j + 1]) {
					cnt++;
					max = Math.max(max, cnt);
				} else {
					cnt = 1;
				}
			}
		}
	}

	static void colCheck() {
		for (int i = 0; i < n; i++) {
			int cnt = 1;
			for (int j = 0; j < n - 1; j++) {
				if (candy[j][i] == candy[j + 1][i]) {
					cnt++;
					max = Math.max(max, cnt);
				} else {
					cnt = 1;
				}
			}
		}
	}

	static void swap(int x1, int y1, int x2, int y2) {
		char temp = candy[x1][y1];
		candy[x1][y1] = candy[x2][y2];
		candy[x2][y2] = temp;
	}
}
