import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

		int total = 0;
		for (int i = 0; i < t; i++) {
			Stack<Character> stack = new Stack<>();
			String s = br.readLine();
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				if (s.charAt(j) == '(') {
					stack.push(c);
				} else {
					if (stack.isEmpty()) {
						stack.push(c);
						break;
					} else {
						stack.pop();
					}
				}
			}
			if (stack.isEmpty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");		
			}

		}

		br.close();
	}
}
