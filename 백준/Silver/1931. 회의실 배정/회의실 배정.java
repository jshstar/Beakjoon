import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[][] meetingTime = new int[n][2];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			meetingTime[i][0] = Integer.parseInt(st.nextToken());
			meetingTime[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(meetingTime, new Comparator<int[]>() {
			@Override
			public int compare(int[] t1, int[] t2) {
				if (t1[1] == t2[1]) {
					return t1[0] - t2[0];
				}
				return t1[1] - t2[1];
			}
		});

		int cnt = 0;
		int checkTime = 0;
		for (int i = 0; i < n; i++) {
			if (checkTime <= meetingTime[i][0]){
				checkTime = meetingTime[i][1];
				cnt++;
			}
		}
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
		br.close();
	}

}

