import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
				int x = Math.abs(o1);
				int y = Math.abs(o2);

				if(x == y){
					if(o1 < o2){
						return -1;
					} else {
						return 1;
					}
				}
				else if (x < y) {
					return -1;
				} else {
					return 1;
				}
			}
		);

		for (int i = 0; i < n; i++) {
			int k = Integer.parseInt(br.readLine());
			if(k == 0){
				if(pq.isEmpty()){
					bw.write("0\n");
				} else {
					bw.write(pq.poll() + "\n");
				}
			} else {
				pq.add(k);
			}
		}


		bw.flush();
		bw.close();
		br.close();

	}

}


