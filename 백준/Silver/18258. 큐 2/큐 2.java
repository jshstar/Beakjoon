import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Deque<String> q = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String s = st.nextToken();
			switch (s) {
				case "push":
					q.add(st.nextToken());
					break;
				case "pop":
					if (!q.isEmpty()) {
						bw.write(q.poll() + "\n");
					} else {
						bw.write("-1" + "\n");
					}
					break;
				case "size":
					bw.write(q.size() + "\n");
					break;
				case "empty":
					if (q.isEmpty()) {
						bw.write("1" + "\n");
					} else {
						bw.write("0" + "\n");
					}
					break;
				case "front":
					if (!q.isEmpty()) {
						bw.write(q.peek() + "\n");
					} else {
						bw.write("-1" + "\n");
					}
					break;
				case "back":
					String sNum = q.peekLast();
					if(sNum == null){
						bw.write("-1" +  "\n");
					} else {
						bw.write(sNum + "\n");
					}
					break;
			}

		}
		bw.flush();
		br.close();
		bw.close();
	}
}
