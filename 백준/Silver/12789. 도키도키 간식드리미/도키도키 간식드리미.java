import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Stack<Integer> stack = new Stack<>();
		int check = 1;
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (check == num) {
				check++;
				while(!stack.isEmpty()){
					if(check == stack.peek()){
						stack.pop();
						check++;
					} else {
						break;
					} 
				}
			} else {
				stack.push(num);
			}
		}
		int cnt = stack.size();
		for (int i = 0; i < cnt; i++) {
			if(check != stack.pop()){
				System.out.println("Sad");
				break;
			} else {
				check++;
			}
		}

		if (stack.isEmpty()) {
			System.out.println("Nice");
		}

		br.close();
	}
}
