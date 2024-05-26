import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			Stack<Character> stack = new Stack<>();
			String s = br.readLine();
			if(s.equals(".")){
				break;
			}
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);

				if (c == '(' || c == '[') {
					stack.push(c);
				} else if(c == ')' || c == ']') {
					if (stack.isEmpty() || (stack.peek() == '(' && c == ']') || (stack.peek() == '[' && c == ')')) {
						stack.push(c);
						break;
					}
					stack.pop();
				}
			}

			if (stack.isEmpty()) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}

		}
		br.close();

	}
}
