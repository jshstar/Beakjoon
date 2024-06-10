import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		if (n == 4 || n == 7) {
			cnt = -1;
		} else if (n % 5 == 0) {
			cnt = n / 5;
		} else if (n % 5 == 1 || n % 5 == 3) {
			cnt = n / 5 + 1;
		} else if (n % 5 == 2 || n % 5 == 4) {
			cnt = n / 5 + 2;
		}
		System.out.println(cnt);
		br.close();

	}
}

