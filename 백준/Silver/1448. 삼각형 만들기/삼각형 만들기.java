import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());

		}

		Arrays.sort(arr, Collections.reverseOrder());
		boolean flag = false;
		for (int i = 0; i < n - 2; i++) {
			if (arr[i] < arr[i + 1] + arr[i + 2]) {
				bw.write(String.valueOf(arr[i] + arr[i + 1] + arr[i + 2]));
				flag = true;
				break;
			}
		}

		if(!flag){
			bw.write(String.valueOf(-1));
		}



		bw.flush();
		bw.close();
		br.close();
	}

}
