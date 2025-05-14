import java.net.Inet4Address;
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			LinkedList<int[]> q = new LinkedList<>();
			for (int j = 0; j < n; j++) {
				q.add(new int[]{j, Integer.parseInt(st.nextToken())});
			}

			int cnt = 0;
			while(!q.isEmpty()){
				int[] front = q.poll();
				boolean isMax = true;

				for (int j = 0; j < q.size(); j++) {
					if(front[1] < q.get(j)[1]){
						q.add(front);
						for (int k = 0; k < j; k++) {
							q.add(q.poll());
						}
						isMax = false;
						break;
					}
				}
				if(!isMax) {
					continue;
				}

				cnt++;
				if(front[0] == m) {
					break;
				}
			}

			bw.write(cnt + "\n");

		}



		bw.flush();
		bw.close();
		br.close();
	}

}
