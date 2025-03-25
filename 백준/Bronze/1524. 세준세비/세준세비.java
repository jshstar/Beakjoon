import java.util.*;
import java.io.*;

import javax.swing.text.Position;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			int maxSj = 0, maxSb = 0;

			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				int sejun = Integer.parseInt(st.nextToken());
				if (maxSj < sejun) maxSj = sejun;
			}

			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				int sebi = Integer.parseInt(st.nextToken());
				if (maxSb < sebi) maxSb = sebi;
			}

			if (maxSj >= maxSb) {
				bw.write("S" + "\n");
			} else {
				bw.write("B" + "\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();

	}


}



