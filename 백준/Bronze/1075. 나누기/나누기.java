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
		int n = Integer.parseInt(br.readLine());
		n /= 100;
		n *= 100;
		int f = Integer.parseInt(br.readLine());
		int result = 0;
		while (n % f != 0) {
			n++;
			result++;
		}
		if (result < 10) {
			bw.write("0" + result);
		} else {
			bw.write(result + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}

}

