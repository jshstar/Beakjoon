import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int cnt = 1;
		int range = 2;
		if (n == 1) {
			System.out.println(1);
		} else {
			while(range <= n){
				range += (6 * cnt);
				cnt++;
			}
			System.out.println(cnt);
		}
		br.close();
	}
}
