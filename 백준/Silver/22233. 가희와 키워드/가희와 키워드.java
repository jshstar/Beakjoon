import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Integer.parseInt(st.nextToken());
		long m = Integer.parseInt(st.nextToken());
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			map.put(s , 1);
		}
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), ",");
			while(st.hasMoreTokens()){
				String key = st.nextToken();
				map.remove(key);
			}
			bw.write(map.size() + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}




