import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			switch (st.nextToken()){
				case "1":
					stack.push(Integer.parseInt(st.nextToken()));
					break;
				case "2":
					if(!stack.isEmpty()) {
						bw.write(stack.pop() + "\n");
					} else {
						bw.write(-1 + "\n");
					}
					break;
				case "3":
					bw.write(stack.size() + "\n");
					break;
				case "4":
					if(stack.isEmpty()){
						bw.write(1 + "\n");
					} else {
						bw.write(0 + "\n");
					}
					break;
				case "5":
					if(!stack.isEmpty()){
						bw.write(stack.peek() + "\n");
					} else {
						bw.write(-1 + "\n");
					}
					break;
			}
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
