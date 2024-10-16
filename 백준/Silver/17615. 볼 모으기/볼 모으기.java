import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		char[] ball = br.readLine().toCharArray();
		int red = 0;
		int blue = 0;
		int result = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (ball[i] == 'R') {
				red++;
			} else {
				blue++;
			}
		}
		int cnt = 0;
		for (int i = 0; i < ball.length; i++) {
			if (ball[i] == 'R') {
				cnt++;
			} else {
				break;
			}
		}
		min = red - cnt;

		cnt = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (ball[i] == 'R') {
				cnt++;
			} else {
				break;
			}
		}
		min = Math.min(min, red - cnt);

		cnt = 0;
		for (int i = 0; i < ball.length; i++) {
			if (ball[i] == 'B') {
				cnt++;
			} else {
				break;
			}
		}
		min = Math.min(min, blue - cnt);
		cnt = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (ball[i] == 'B') {
				cnt++;
			} else {
				break;
			}
		}
		min = Math.min(min, blue - cnt);
		bw.write(String.valueOf(min));
		bw.flush();
		bw.close();
		br.close();

	}

}






