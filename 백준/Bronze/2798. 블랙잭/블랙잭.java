import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int answer = blackjack(arr, n, m);
		System.out.println(answer);

		br.close();
	}

	public static int blackjack(int[] arr, int n, int m) {
		int answer = 0;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					sum = arr[i] + arr[j] + arr[k];
					int difference = m - sum;
					if (difference == 0) {
						return sum;
					} else if (difference > 0 && difference < min) {
						min = difference;
						answer = sum;
					}
				}
			}
		}
		return answer;
	}
}

