import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] belt = new int[2 * n];
		boolean[] robot = new boolean[n];
		st = new StringTokenizer(br.readLine());
		int level = 0;
		for (int i = 0; i < belt.length; i++) {
			belt[i] = Integer.parseInt(st.nextToken());
		}

		while (true) {
			level++;
			
			int temp = belt[2 * n - 1];
			for (int i = 2 * n - 1; i > 0; i--) {
				belt[i] = belt[i - 1];
			}
			belt[0] = temp;
			for (int i = n - 1; i > 0; i--) {
				robot[i] = robot[i - 1];
			}
			
			robot[0] = false;
			robot[n - 1] = false;

			
			for (int i = n - 1; i > 0; i--) {
				if (robot[i - 1] && !robot[i] && belt[i] > 0) {
					robot[i - 1] = false;
					robot[i] = true;
					belt[i]--;
					robot[n - 1] = false;
				}
			}

			if (belt[0] > 0) {
				robot[0] = true;
				belt[0]--;
			}

			int cnt = 0;
			for (int i = 0; i < 2 * n; i++) {
				if (belt[i] == 0) {
					cnt++;
				}
			}

			if (cnt >= k) {
				break;
			}
		}
		bw.write(String.valueOf(level));

		bw.flush();
		bw.close();
		br.close();

	}

}






