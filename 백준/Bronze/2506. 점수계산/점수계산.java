import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0;
		int total = 0;
		for (int i = 0; i < n; i++) {

			int num = Integer.parseInt(st.nextToken());

			if (num == 1) {
				total += ++cnt;
			} else {
				cnt = 0;
			}

		}
		bw.write(String.valueOf(total));

		bw.flush();
		bw.close();
		br.close();
	}

}
