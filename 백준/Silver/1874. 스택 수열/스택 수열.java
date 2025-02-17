import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 1 2 3 4 5 6 7 8
		// 4 3 6 8 8 7 5 2 1
		// 4 3 6
		// 1 2 5 6
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		List<String> answer = new ArrayList<>();
		int p = 1;
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			while(true){
				if(p <= num){
					stack.push(p);
					p++;
					answer.add("+");
				}

				if(stack.peek() == num){
					stack.pop();
					answer.add("-");
					break;
				} else if(num < p && stack.peek() != num){
					answer.clear();
					answer.add("NO");
					break;
				}
			}
			if(answer.get(answer.size()-1).equals("NO")){
				break;
			}
		}

		for (int i = 0; i < answer.size(); i++) {
			System.out.println(answer.get(i));
		}
		br.close();
	}


}
