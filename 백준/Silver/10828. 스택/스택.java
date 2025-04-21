import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			int num = 0;
			if (st.hasMoreTokens()) {
				num = Integer.parseInt(st.nextToken());
			}

			switch (order) {
				case "push":
					stack.add(num);
					break;
				case "pop":
					if (stack.isEmpty()) {
						bw.write(-1 + "\n");
					} else {
						bw.write(stack.pop() + "\n");
					}
					break;
				case "size":
					bw.write(stack.size() + "\n");
					break;
				case "empty":
					if (stack.isEmpty()) {
						bw.write(1 + "\n");
					} else {
						bw.write(0 + "\n");
					}
					break;
				case "top":
					if (stack.isEmpty()) {
						bw.write(-1 + "\n");
					} else {
						bw.write(stack.peek() + "\n");
					}
					break;

			}

		}

		bw.flush();
		bw.close();
		br.close();
	}

}
