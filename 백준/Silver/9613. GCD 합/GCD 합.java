import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for(int i = 0; i < n; i++){
			long sum = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int t = Integer.parseInt(st.nextToken());
			int[] arr = new int[t];
			for(int j = 0; j < t; j++){
				arr[j] = Integer.parseInt(st.nextToken());
			}
			for (int j = 0; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					sum += gcd(arr[j], arr[k]);
				}
			}
			bw.write(sum + "\n");

		}
		
		bw.flush();
		bw.close();
		br.close();
	}

	public static int gcd(int a, int b){
		while(b != 0){
			int tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}

}
