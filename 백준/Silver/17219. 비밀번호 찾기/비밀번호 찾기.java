import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		HashMap<String, String> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String address = st.nextToken();
			String pw = st.nextToken();

			map.put(address, pw);
		}

		for (int i = 0; i < m; i++) {
			String address = br.readLine();
			bw.write(map.get(address) + "\n");
		}

		bw.flush();
		bw.close();
		br.close();

	}

}


