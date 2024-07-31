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
		long reasult = factorial(n);
		bw.write(reasult + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
	public static long factorial(int n){
		if(n <= 1){
			return 1;
		}
		return n * factorial(n - 1);
	}
}

