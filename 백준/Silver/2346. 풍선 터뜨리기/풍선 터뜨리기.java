import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Deque<int[]> dq = new ArrayDeque<>();
		for (int i = 1; i <= n; i++) {
			dq.add(new int[] {i, Integer.parseInt(st.nextToken())});
		}
		while (dq.size() > 1) {
			int[] arr = dq.pollFirst();
			bw.write(String.valueOf(arr[0]) + " ");
			if (arr[1] > 0) {
				for (int i = 1; i < arr[1] ; i++) {
					dq.addLast(dq.pollFirst());
				}
			} else {
				for (int i = arr[1]; i != 0 ; i++) {
					dq.addFirst(dq.pollLast());
				}
			}

		}
		bw.write(String.valueOf(dq.poll()[0]));
		bw.flush();
		bw.close();
		br.close();
	}
}
