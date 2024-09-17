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
		int n = Integer.parseInt(st.nextToken());
		String game = st.nextToken();
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String name = br.readLine();
			map.put(name, 1);
		}

		switch (game) {
			case "Y":
				bw.write(map.size() + "\n");
				break;
			case "F":
				bw.write(map.size()/2 + "\n");
				break;
			case "O":
				bw.write(map.size()/3 + "\n");
				break;
		}


		bw.flush();
		bw.close();
		br.close();
	}
}


