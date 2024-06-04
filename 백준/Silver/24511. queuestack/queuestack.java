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
		Deque<Integer> dq = new ArrayDeque<>();
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(arr[i] == 0){
				dq.addLast(num);
			}
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			dq.addFirst(Integer.parseInt(st.nextToken()));
			bw.write(dq.pollLast() + " ");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
