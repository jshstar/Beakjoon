import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int cnt = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), ",");

		int[] arr = new int[n];
		for(int i = 0; i < n; i ++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < cnt; i++){
			int[] tmp = Arrays.copyOf(arr, arr.length);
			for (int j = i + 1; j < n; j++) {
				arr[j] = tmp[j] - tmp[j - 1];
			}
		}

		for (int i = cnt; i < n; i++) {
			if(i == n - 1){
				bw.write(String.valueOf(arr[i]));
			} else {
				bw.write(arr[i] + ",");
			}

		}

		bw.flush();
		bw.close();
		br.close();
	}

}
