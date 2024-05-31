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
		Deque<String> dq = new ArrayDeque<>();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			switch (st.nextToken()) {
				case "1":
					dq.addFirst(st.nextToken());
					break;
				case "2":
					dq.addLast(st.nextToken());
					break;
				case "3":
					if(dq.isEmpty()){
						bw.write( "-1" + "\n");
					} else {
						bw.write(dq.pollFirst() + "\n");
					}
					break;
				case "4":
					if(dq.isEmpty()){
						bw.write("-1" + "\n");
					} else {
						bw.write(dq.pollLast() + "\n");
					}
					break;
				case "5":
					bw.write(dq.size() + "\n");
					break;
				case "6":
					if(dq.isEmpty()){
						bw.write("1" + "\n");
					} else {
						bw.write("0" + "\n");
					}
					break;
				case "7":
					if(dq.isEmpty()){
						bw.write("-1" + "\n");
					} else {
						bw.write(dq.peekFirst() + "\n");
					}
					break;
				case "8":
					if(dq.isEmpty()){
						bw.write("-1" + "\n");
					} else {
						bw.write(dq.peekLast() + "\n");
					}
					break;
			}
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
