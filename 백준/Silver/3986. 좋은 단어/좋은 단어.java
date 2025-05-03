import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> stack;
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i = 0; i < n; i++){
			stack = new Stack<>();

			String s = br.readLine();

			if(s.length() % 2 == 1){
				continue;
			}
			stack.add(s.charAt(0));
			for (int j = 1; j < s.length(); j++) {
				char c = s.charAt(j);
				if(stack.size() > 0 && stack.peek() == s.charAt(j)){
					stack.pop();
				} else {
					stack.push(c);
				}
			}
			if(stack.isEmpty()){
				cnt++;
			}


		}

		bw.write(String.valueOf(cnt));

		bw.flush();
		bw.close();
		br.close();
	}

}
