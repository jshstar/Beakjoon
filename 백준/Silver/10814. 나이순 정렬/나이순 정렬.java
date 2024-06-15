import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		String[][] arr = new String[n][2];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}

		Arrays.sort(arr, Comparator.comparingInt(age -> Integer.parseInt(age[0])));

		for (int i = 0; i < n; i++) {
			bw.write(arr[i][0] + " " + arr[i][1] + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}

