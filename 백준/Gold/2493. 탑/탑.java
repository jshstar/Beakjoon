import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<int[]> stack = new Stack<>();
		for (int i = 1; i <= n ; i++) {
			int top = Integer.parseInt(st.nextToken());
			while(!stack.isEmpty()){
				if(stack.peek()[1] >= top){
					bw.write(stack.peek()[0] + " ");
					break;
				}
				stack.pop();
			}
			if(stack.isEmpty()){
				bw.write("0 ");
			}
			stack.push(new int[]{i, top});
		}

		bw.flush();
		bw.close();
		br.close();
	}


}
