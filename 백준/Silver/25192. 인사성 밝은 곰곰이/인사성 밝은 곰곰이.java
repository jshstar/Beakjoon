import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int bearCnt = 0;
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			if(s.equals("ENTER")){
				bearCnt += map.size();
				map.clear();
			} else {
				map.put(s, 1);
			}
		}
		bearCnt += map.size();
		bw.write(bearCnt + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

}

