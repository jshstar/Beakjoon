import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				queue.add(Integer.parseInt(st.nextToken()));
			}
		}
		int result = 0;
		for (int i = 0; i < n; i++) {
			if(!queue.isEmpty()){
				result = queue.poll();
			}
		}
		bw.write(result + "\n");

		bw.flush();
		bw.close();
		br.close();
	}


}




