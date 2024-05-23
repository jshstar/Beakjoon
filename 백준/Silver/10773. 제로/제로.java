import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int k = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		int total = 0;
		for (int i = 0; i < k; i++) {
			String s = br.readLine();
			if (s.equals("0")) {
				total -= stack.pop();
			} else {
				total += stack.push(Integer.parseInt(s));
			}
		}
		bw.write(String.valueOf(total));
		bw.flush();
		br.close();
		bw.close();
	}
}
