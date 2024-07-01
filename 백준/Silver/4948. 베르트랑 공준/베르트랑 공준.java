import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while (true) {
			int n = Integer.parseInt(br.readLine());
			int cnt = 0;
			if (n == 0){
				break;
			}
			for (int i = n + 1; i <= 2 * n; i++) {
				boolean flag = true;
				for (int j = 2; j <= Math.sqrt(i); j++) {
					if (i % j == 0) {
						flag = false;
						break;
					}
				}
				if (flag) {
					cnt++;
				}
			}
			bw.write(cnt + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}

}

