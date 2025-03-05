import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;
		HashMap<String, Integer> map;
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			map = new HashMap<>();
			for (int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				String name = st.nextToken();
				String type = st.nextToken();
				map.put(type, map.getOrDefault(type, 0) + 1);
			}
			int cnt = 1;
			for (int val : map.values()) {
				cnt *= val + 1;
			}
			bw.write(String.valueOf(cnt - 1) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();

	}

}


