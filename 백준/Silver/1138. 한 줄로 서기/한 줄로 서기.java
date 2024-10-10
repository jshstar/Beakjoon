import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n ; i++){
			int cnt = 0;
			int left = Integer.parseInt(st.nextToken());
			for (int j = 0; j < n; j++) {
				if(arr[j] == 0){
					if(cnt == left){
						arr[j] = i + 1;
						break;
					}
					cnt++;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			bw.write(arr[i] + " ");
		}

		bw.flush();
		bw.close();
		br.close();
	}

}




