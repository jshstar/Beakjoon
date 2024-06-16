import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		;
		Map<Integer, Integer> map = new HashMap<>();
		int[] arr = new int[n];
		int[] rank = new int[n];
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			arr[i] = num;
			rank[i] = num;
		}
		Arrays.sort(rank);
		map.put(rank[0], cnt);
		cnt++;
		for (int i = 1; i < rank.length; i++) {
			if (rank[i] != rank[i - 1]){
				map.put(rank[i], cnt);
				cnt++;
			}
		}
		bw.write(String.valueOf(map.get(arr[0])));
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			bw.write(" " + map.get(key));
		}
		bw.flush();
		bw.close();
		br.close();
	}
}

