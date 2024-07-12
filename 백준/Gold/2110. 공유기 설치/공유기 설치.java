import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		int min = 1;
		int max = arr[n - 1] - arr[0] + 1;
		while (min < max){
			int mid = (min + max)/2;
			if(findInstall(mid) < c){
				max = mid;
			} else {
				min = mid + 1;
			}

		}

		bw.write(String.valueOf(min - 1));
		bw.flush();
		bw.close();
		br.close();
	}

	public static int findInstall(int distant){
		int cnt = 1;
		int lastLocate = arr[0];
		for (int i = 0; i < arr.length; i++) {
			int locate = arr[i];

			if(locate - lastLocate >= distant){
				cnt++;
				lastLocate = locate;
			}
		}
		return cnt;
	}

}

