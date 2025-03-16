import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[5];

		int cnt =0;
		int n = 0;

		for(int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		while(true){
			n++;
			for(int i = 0; i < 5; i++) {
				if(n >= arr[i] && n % arr[i] == 0) cnt++;
			}

			if(cnt > 2){
				break;	
			}
			cnt = 0;
		}
		bw.write(String.valueOf(n));
		bw.flush();
		br.close();
		bw.close();

	}
}
