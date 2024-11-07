import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		int ten = 0;

		for (int i = 0; i < m; i++) {
			int square = m - i - 1;

			ten += (int)(Math.pow(a, square) * (Integer.parseInt(st.nextToken())));
		}

		while (ten > 0) {
			stack.push(ten % b);
			ten /= b;
		}

		while (!stack.isEmpty()) {
			sb.append(stack.pop()).append(" ");
		}
		while (!stack.isEmpty()) {
			sb.append(stack.pop()).append(" ");
		}

		bw.write(String.valueOf(sb));

		bw.flush();
		bw.close();
		br.close();
	}

}
