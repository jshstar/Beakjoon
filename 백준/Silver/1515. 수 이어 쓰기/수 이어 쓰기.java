import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		bw.write(findN(s) + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	static int findN(String s) {
		int point = 0;
		int base = 0;
		while (base++ <= 30000) {
			String tmp = String.valueOf(base);
			for (int i = 0; i < tmp.length(); i++) {
				if (tmp.charAt(i) == s.charAt(point)) {
					point++;
				}
				if (point == s.length()) {
					return base;
				}
			}
		}
		return 0;
	}

}


