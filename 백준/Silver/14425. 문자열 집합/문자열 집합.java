import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int cnt = 0;
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(br.readLine(), 1);
		}
		for (int i = 0; i < m; i++) {
			if(map.get(br.readLine()) != null) {
				cnt++;
			}
		}
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
		br.close();
	}
}

