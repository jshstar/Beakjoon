import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main {


	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] num = new int[10];
		Long m = 1L;
		for (int i = 0; i < 3; i++) {
			int n = Integer.parseInt(br.readLine());
			m *= n;
		}
		String s = Long.toString(m);
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			num[c - 48] += 1;
		}
		for (int i = 0; i < 10; i++) {
			bw.write(num[i] + "\n");
		}

		bw.flush();
		br.close();
		bw.close();
	}

}

