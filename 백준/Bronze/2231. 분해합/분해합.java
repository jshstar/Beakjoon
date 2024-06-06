import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int m = 0;

		for (int i = 1; i <= n; i++) {
			int number = i;
			int result = 0;

			while (number > 0) {
				result += number % 10;
				number /= 10;
			}

			if (result + i == n) {
				m = i;
				break;
			}
		}
		bw.write(m + "\n");
		bw.flush();
		bw.close();
		br.close();

	}
}

