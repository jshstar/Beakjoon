import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static char[] arr;
	static int cnt = 0;
	static int k;
	static int n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		arr = new char[n];
		String s = br.readLine();
		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);
		}

		for (int i = 0; i < n; i++) {
			if (i < n - k) {
				if (findRight(arr[i], i)) {
					cnt++;
				}

			} else if (i > k - 1) {
				if (findLeft(arr[i], i)) {
					cnt++;
				}

			}
		}
		bw.write(cnt + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	static boolean findRight(char c, int p) {
		char target = 0;
		if (c == 'H') {
			target = 'P';
		} else if (c == 'P') {
			target = 'H';
		}

		for (int i = p + 1; i <= p + k; i++) {
			if (arr[i] == target) {
				arr[p] = '0';
				arr[i] = '0';
				return true;
			}
		}
		return false;

	}

	static boolean findLeft(char c, int p) {
		char target = 0;
		if (c == 'H') {
			target = 'P';
		} else if (c == 'P') {
			target = 'H';
		}
		for (int i = p - 1; i >= p - k; i--) {
			if (arr[i] == target) {
				arr[p] = '0';
				arr[i] = '0';
				return true;
			}
		}

		return false;
	}

}


