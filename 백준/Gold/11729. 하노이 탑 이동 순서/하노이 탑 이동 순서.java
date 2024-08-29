import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = (int)(Math.pow(2, n) - 1);
		bw.write(count + "\n");
		hanoi(n, 1, 2, 3);
		bw.flush();
		br.close();
		bw.close();
	}

	static void hanoi(int n, int start, int sub, int target) throws IOException {
		if (n == 1) {
			bw.write(start + " " + target + "\n");
			return;
		}

		hanoi(n - 1, start, target, sub);
		bw.write(start + " " + target + "\n");
		hanoi(n - 1, sub, start, target);

	}

}

