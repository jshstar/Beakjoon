import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String s1 = br.readLine();
		String s2 = br.readLine();

		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++)
			arr1[i] = s1.charAt(i) - '0';
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++)
			arr2[i] = s2.charAt(i) - '0';

		int[] arr3 = Arrays.copyOf(arr1, n);
		arr3[0] = 1 - arr3[0];
		arr3[1] = 1 - arr3[1];

		int answer = solve(n, arr1, arr2);
		int answer2 = solve(n, arr3, arr2);
		if (answer2 != -1)
			answer2++;

		if (answer == -1) {
			bw.write(String.valueOf(answer2));
		} else if (answer2 == -1) {
			bw.write(String.valueOf(answer));
		} else {
			bw.write(String.valueOf(Math.min(answer2, answer)));
		}

		bw.flush();
		bw.close();
		br.close();
	}

	private static int solve(int n, int[] arr1, int[] arr2) {
		int cnt = 0;

		for (int i = 0; i < n - 1; i++) {
			if (arr1[i] != arr2[i]) {
				cnt++;
				arr1[i] = 1 - arr1[i];
				arr1[i + 1] = 1 - arr1[i + 1];
				if (i != n - 2)
					arr1[i + 2] = 1 - arr1[i + 2];
			}
		}
		if (arr1[n - 1] != arr2[n - 1]){
			return -1;
		} else {
			return cnt;
		}

	}

}
