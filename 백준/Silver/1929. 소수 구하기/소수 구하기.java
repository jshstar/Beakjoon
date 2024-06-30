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
		StringTokenizer st = new StringTokenizer(br.readLine(),  " ");
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		for (int i = m; i <= n; i++) {
			boolean flag = true;
			if(i < 2){
				continue;
			} else {
				for (int j = 2; j <= Math.sqrt(i) ; j++) {
					if(i % j == 0) {
						flag = false;
						break;
					}
				}
			}
			if(flag){
				bw.write(i + "\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

}

