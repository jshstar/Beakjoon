import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			q.add(i);
		}
		bw.write("<");
		while (!q.isEmpty()) {
			for (int i = 0; i < k - 1; i++) {
				q.add(q.poll());
			}
			if(q.size() > 1){
				bw.write(String.valueOf(q.poll()) + ", ");
			} else {
				bw.write(String.valueOf(q.poll()));
			}
		}
		bw.write(">");
		bw.flush();
		br.close();
		bw.close();
	}
}
