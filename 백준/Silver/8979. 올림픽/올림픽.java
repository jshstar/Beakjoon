import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		HashMap<Integer, int[]> map = new HashMap<>();
		int[] kArr = new int[3];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int num = Integer.parseInt(st.nextToken());
			int[] arr = new int[3];
			if (num == k) {
				for (int j = 0; j < 3; j++) {
					kArr[j] = Integer.parseInt(st.nextToken());
				}
			} else {
				for (int j = 0; j < 3; j++) {
					arr[j] = Integer.parseInt(st.nextToken());
				}
				map.put(num, arr);
			}

		}
		int rank = 1;
		for (Integer key : map.keySet()) {
			int[] keyArr = map.get(key);
			if (keyArr[0] > kArr[0]) {
				rank++;
			} else if (keyArr[0] == kArr[0]) {
				if (keyArr[1] > kArr[1]){
					rank++;
				} else if(keyArr[1] == kArr[1]) {
					if(keyArr[2] > kArr[2]){
						rank++;
					}
				}
			}
		}
		bw.write(rank + "\n");

		bw.flush();
		bw.close();
		br.close();
	}
}
