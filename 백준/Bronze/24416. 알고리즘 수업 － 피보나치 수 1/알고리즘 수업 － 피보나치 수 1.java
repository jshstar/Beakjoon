import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main {
	static int code1Cnt, code2Cnt;
	static int[] f;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		f = new int[n];
		code1Cnt = 0;
		code2Cnt = 0;
		fib(n);
		fibonacci(n);
		bw.write(code1Cnt + " " + code2Cnt);
		bw.flush();
		bw.close();
		br.close();
	}

	static int fib(int n) {
		if (n == 1 || n == 2) {
			code1Cnt++;
			return 1;
		} else
			return (fib(n - 1) + fib(n - 2));
	}

	static int fibonacci(int n) {
		f[0] = 1;
		f[1] = 1;

		for (int i = 2; i < n; i++) {
			code2Cnt++;
			f[i] = f[i - 1] + f[i - 2];
		}
		return f[n - 1];
	}

}

