import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken()); // 초밥 가짓수
		int k = Integer.parseInt(st.nextToken()); // 연속 접시 수
		int c = Integer.parseInt(st.nextToken()); // 쿠폰번호
		int[] cho = new int[n];
		for (int i = 0; i < n; i++) {
			cho[i] = Integer.parseInt(br.readLine());
		}

		int[] eat = new int[d + 1];
		eat[c] = 3001;
		int cnt = 1;
		for (int i = 0; i < k; i++) {
			if (eat[cho[i]] == 0) {
				cnt++;
			}
			eat[cho[i]]++;
		}

		int max = cnt;

		for (int i = 0; i < n - 1; i++) {
			int start = cho[i];
			int end;
			if (i + k < n) {
				end = cho[i + k];
			} else {
				end = cho[(i + k) % n] ;
			}

			if(--eat[start] == 0){
				cnt--;
			}

			if(++eat[end] == 1){
				cnt++;
			}
			max = Math.max(max, cnt);
		}
		bw.write(String.valueOf(max));

		bw.flush();
		bw.close();
		br.close();

	}

}
