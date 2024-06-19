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
		Map<String, Integer> mapS = new HashMap<>();
		Map<Integer, String> mapI = new HashMap<>();
		for(int i = 1; i <= n; i++){
			String s = br.readLine();
			mapS.put(s, i);
			mapI.put(i, s);

		}

		for (int i = 0; i < m; i++) {
			String s = br.readLine();
			char c = s.charAt(0);
			if(c > 48 && c <= 57){
				bw.write(mapI.get(Integer.parseInt(s)) + "\n");
			} else {
				bw.write(mapS.get(s) + "\n");
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}

