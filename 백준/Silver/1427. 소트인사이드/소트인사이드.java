import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		Integer[] n = new Integer[s.length()];
		for (int i = 0; i < s.length(); i++) {
			n[i] = s.charAt(i) - 48;
		}
		Arrays.sort(n, Comparator.reverseOrder());
		for (int i = 0; i < n.length; i++) {
			bw.write(String.valueOf(n[i]));
		}
		bw.flush();
		bw.close();
		br.close();

	}
}

