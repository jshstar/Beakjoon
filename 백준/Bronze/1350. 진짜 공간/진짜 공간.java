import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		long cnt = 0;
		long size = Long.parseLong(br.readLine());
		for (int i = 0; i < n; i++) {
			long file = Long.parseLong(st.nextToken());
			if(file != 0) {
				cnt += (file / size);
				if(file % size != 0) {
					cnt++;
				}
			}
		}
		bw.write(String.valueOf(size * cnt));


		bw.flush();
		bw.close();
		br.close();

	}

}

