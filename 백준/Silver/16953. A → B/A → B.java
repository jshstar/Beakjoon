import java.util.*;
import java.io.*;

public class Main {

	static int cnt = 0;

	static long a, b;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());

		bw.write(String.valueOf(bfs()));

		bw.flush();
		bw.close();
		br.close();
	}

	static int bfs() {
		Queue<Long> q = new LinkedList<>();
		q.add(a);

		while(!q.isEmpty()){
			int size = q.size();
			for (int i = 0; i < size; i++){
				long num = q.poll();
				if(num == b){
					return cnt + 1;
				}
				if(num * 2 <= b){
					q.add(num * 2);
				}
				if(num * 10 + 1 <= b){
					q.add(num * 10 + 1);
				}
			}
			cnt++;
		}
		return -1;

	}

}
