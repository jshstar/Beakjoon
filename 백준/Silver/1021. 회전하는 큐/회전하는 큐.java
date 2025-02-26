import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		LinkedList<Integer> deq = new LinkedList<Integer>();
		int cnt = 0;

		for (int i = 1; i <= n; i++) {
			deq.add(i);
		}

		int[] arr = new int[m];

		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < m; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < m; i++) {
			if(deq.getFirst() == arr[i]){
				deq.removeFirst();
				continue;
			}


			int findIdx = deq.indexOf(arr[i]);
			int backCnt = deq.size() - findIdx;

			if(findIdx < backCnt){
				while(deq.getFirst() != arr[i]){
					deq.addLast(deq.removeFirst());
					cnt++;
				}
			}

			else{
				while(deq.getFirst() != arr[i]){
					deq.addFirst(deq.removeLast());
					cnt++;
				}
			}

			deq.removeFirst();
		}

		bw.write(String.valueOf(cnt));

		bw.flush();
		bw.close();
		br.close();

	}

}


