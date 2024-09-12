import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for (int i = 0; i < n; i++) {
			int cnt = 0;
			int[] arr = new int[20];
			st = new StringTokenizer(br.readLine());
			bw.write(st.nextToken() + " ");
			for (int j = 0; j < 20; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			for (int j = 1; j < arr.length; j++) {
				int a = arr[j];
				int b = j - 1;
				while(b >= 0 && arr[b] > a){
					arr[b + 1] = arr[b];
					b--;
					cnt++;
				}
				arr[b + 1] = a;
			}
			bw.write(cnt + "\n");

		}
		bw.flush();
		bw.close();
		br.close();
	}
}
