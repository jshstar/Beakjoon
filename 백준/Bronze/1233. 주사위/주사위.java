import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s1 = Integer.parseInt(st.nextToken());
		int s2 = Integer.parseInt(st.nextToken());
		int s3 = Integer.parseInt(st.nextToken());
		int[] arr = new int[s1 + s2 + s3 + 1];
		int result = 0;
		for (int i = 1; i <= s1; i++) {
			for (int j = 1; j <= s2; j++) {
				for (int k = 1; k <= s3; k++) {
					arr[i + j + k]++;
					if (arr[result] < arr[i + j + k])
						result = i + j + k;
					else if (arr[result] == arr[i + j + k])
						result = Math.min(result, i + j + k);
				}
			}
		}

		bw.write(result + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

}
