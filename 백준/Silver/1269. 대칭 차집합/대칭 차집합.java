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
		Map<String, Integer> mapA = new HashMap<>();
		Map<String, Integer> mapB = new HashMap<>();
		int cnt =0;
		int a = 0;
		int b =0;
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			String s = st.nextToken();
			mapA.put(s, mapA.getOrDefault(s, 0)+1);
		}
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < m; i++) {
			String s = st.nextToken();
			mapB.put(s, mapB.getOrDefault(s, 0)+1);
		}
		for(String key: mapB.keySet()){
			if(mapA.get(key) != null){
				cnt++;
			}
		}
		a = mapA.size() - cnt;
		cnt =0;
		for(String key: mapA.keySet()){
			if(mapB.get(key) != null){
				cnt++;
			}
		}
		b = mapB.size() - cnt;
		bw.write(String.valueOf(a + b));
		bw.flush();
		bw.close();
		br.close();
	}
}

