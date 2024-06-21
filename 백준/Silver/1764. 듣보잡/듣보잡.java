import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Map<String, Integer> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			map.put(s, map.getOrDefault(s,0)+1);
		}

		for (int i = 0; i < m; i++) {
			String s = br.readLine();
			map.put(s, map.getOrDefault(s,0)+1);
			if(map.get(s) == 2){
				list.add(s);
			}
		}
		Collections.sort(list);
		bw.write(list.size() + "\n");
		for (int i = 0; i < list.size(); i++) {
			bw.write(list.get(i) + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}

