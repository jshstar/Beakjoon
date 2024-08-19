import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			if(s.length() >= m){
				map.put(s, map.getOrDefault(s, 0)+ 1);
			}
		}
		List<String> wordList = new ArrayList<>(map.keySet());
		wordList.sort((w1, w2) -> {
			int c1 = map.get(w1);
			int c2 = map.get(w2);

			if(c1 == c2){
				if(w1.length() == w2.length()) {
					return w1.compareTo(w2);
				}
				return w2.length()-w1.length();
			}
			return c2-c1;
		});

		for (int i = 0; i < wordList.size(); i++) {
			bw.write(wordList.get(i) + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}


}

