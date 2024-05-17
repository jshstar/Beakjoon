import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arrX = new int[n];
		int[] arrY = new int[n];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arrX[i] = Integer.parseInt(st.nextToken());
			arrY[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arrX);
		Arrays.sort(arrY);
		System.out.println((arrX[n-1] - arrX[0]) * (arrY[n-1] - arrY[0]));
		br.close();
	}
}
