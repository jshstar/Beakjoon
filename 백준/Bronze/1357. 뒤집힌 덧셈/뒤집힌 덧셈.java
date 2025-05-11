import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		StringBuilder sb = new StringBuilder(st.nextToken());
		String s1 = sb.reverse().toString();
		sb = new StringBuilder(st.nextToken());
		String s2 = sb.reverse().toString();

		int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
		sb = new StringBuilder(String.valueOf(sum));
		String result = sb.reverse().toString();

		bw.write(String.valueOf(Integer.parseInt(result)));

		bw.flush();
		bw.close();
		br.close();
	}

}
