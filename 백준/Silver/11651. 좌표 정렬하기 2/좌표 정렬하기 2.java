import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			st =  new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr, (y1, y2) -> {
			if(y1[1] == y2[1]){
				return y1[0] - y2[0];
			} else {
				return y1[1] - y2[1];
			}
		});
		for (int i = 0; i < n; i++) {
			bw.write(arr[i][0] + " " + arr[i][1] + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}

