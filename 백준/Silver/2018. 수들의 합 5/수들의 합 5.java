import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int start = 1;
		int end = 2;
		int cnt = 1;
		while (start < n) {
			int sum = 0;
			for (int i = start; i <= end; i++) {
				sum += i;
			}
			if(sum == n){
				cnt++;
				start++;
				continue;
			}
			if(sum < n){
				end++;
			} else {
				start++;
			}
		}

		bw.write(String.valueOf(cnt));

		bw.flush();
		bw.close();
		br.close();
	}

}


