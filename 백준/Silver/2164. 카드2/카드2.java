import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> q = new LinkedList<>();
		int result = 0;
		boolean flag = true;
		for (int i = 1; i <= n; i++) {
			q.add(i);
		}
		while (!q.isEmpty()) {
			if (flag) {
				result = q.poll();
				flag = false;
			} else {
				q.add(q.poll());
				flag = true;
			}
		}
		System.out.println(result);
		br.close();
	}
}
