import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<String> stack1 = new Stack<>();
		Stack<String> stack2 = new Stack<>();
		String s = br.readLine();

		for (int i = 0; i < s.length(); i++) {
			stack1.push(String.valueOf(s.charAt(i)));
		}

		int m = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			switch (command) {
				case "L":
					if (!stack1.isEmpty()) {
						stack2.push(stack1.pop());
					}
					break;
				case "D":
					if (!stack2.isEmpty()) {
						stack1.push(stack2.pop());
					}
					break;
				case "B":
					if (!stack1.isEmpty()) {
						stack1.pop();
					}
					break;
				case "P":
					stack1.push(st.nextToken());
					break;
				default:
					break;

			}
		}
		while (!stack1.isEmpty())
			stack2.push(stack1.pop());

		while (!stack2.isEmpty())
			bw.write(stack2.pop());
		bw.flush();
		bw.close();
		br.close();
	}

}




