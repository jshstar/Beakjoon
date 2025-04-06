import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int r = Integer.parseInt(br.readLine());
		String s = br.readLine();

		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];

		int score = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
			for (int j = 0; j < r; j++)
				score += rps(s.charAt(j), arr[i].charAt(j));
		}

		bw.write(score + "\n");
		score = 0;

		for (int i = 0; i < r; i++) {
			int a = 0, b = 0, c = 0;
			for (int j = 0; j < n; j++) {
				a += rps('R', arr[j].charAt(i));
				b += rps('P', arr[j].charAt(i));
				c += rps('S', arr[j].charAt(i));
			}
			score += Math.max(a, Math.max(b, c));
		}
		bw.write(score + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	private static int rps(char a, char b) {
		if (a == b)
			return 1;

		if (a == 'R') {
			if (b == 'P')
				return 0;
			return 2;
		} else if (a == 'P') {
			if (b == 'R')
				return 2;
			return 0;
		} else {
			if (b == 'R')
				return 0;
			return 2;
		}
	}

}
