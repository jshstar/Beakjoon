import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		String s = br.readLine();
		Stack<Character> stack = new Stack<>();
		int result = 0;
		int value = 1;


		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == '('){
				stack.push(c);
				value *= 2;
			} else if (c == '['){
				stack.push(c);
				value *= 3;
			} else if(c == ')'){
				if(stack.isEmpty() || stack.peek() != '('){
					result = 0;
					break;
				} else if(s.charAt(i - 1) == '('){
					result += value;
				}
				stack.pop();
				value /= 2;
			} else if(c == ']'){
				if(stack.isEmpty() || stack.peek() != '['){
					result = 0;
					break;
				} else if(s.charAt(i - 1) == '['){
					result += value;
				}
				stack.pop();
				value /= 3;
			}

		}
		if(!stack.isEmpty()){
			bw.write(0 + "\n");
		} else {
			bw.write(result + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}

}
