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
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a1 = Integer.parseInt(st.nextToken());
		int b1 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		int a2 = Integer.parseInt(st.nextToken());
		int b2 = Integer.parseInt(st.nextToken());
		int n = a1 * b2 + a2 * b1;
		int d = b1 * b2;
		int gcd = getGcd(n, d);
		bw.write(n/gcd + " " + d/gcd);
		bw.flush();
		bw.close();
		br.close();
	}

	public static int getGcd(int n, int d) {
		if (n % d == 0) {
			return d;
		}
		return getGcd(d, n % d);
	}
}

