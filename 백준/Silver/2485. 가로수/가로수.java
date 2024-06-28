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
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());

		}
		int gcd = 0;
		for (int i = 0; i < n - 1; i++) {
			int d = arr[i + 1] - arr[i];
			gcd = getGcd(d, gcd);
		}
		bw.write((arr[n - 1] - arr[0]) / gcd + 1 - arr.length + "");
		bw.flush();
		bw.close();
		br.close();
	}

	public static int getGcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

}

