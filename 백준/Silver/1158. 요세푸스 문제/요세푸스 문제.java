import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 1; i <= n; i++){
			queue.add(i);
		}
		bw.write("<");
		while(!queue.isEmpty()){
			for (int i = 0; i < k - 1; i++) {
				int num = queue.poll();
				queue.add(num);
			}
			bw.write(String.valueOf(queue.poll()));
			if(queue.isEmpty()){
				bw.write(">");
			} else {
				bw.write(", ");
			}
		}



		bw.flush();
		bw.close();
		br.close();
	}

}
