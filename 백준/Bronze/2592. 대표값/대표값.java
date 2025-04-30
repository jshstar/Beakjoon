import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[1001];

		int mean = 0;
		int max = 0;
		int maxNum = 0;
		for(int i = 0; i < 10; i++){
			int num = Integer.parseInt(br.readLine());
			arr[num]++;
			mean += num;
		}

		bw.write(mean/10 + "\n");
		for (int i = 0; i < arr.length; i = i + 10) {
			if(max < arr[i]){
				max = arr[i];
				maxNum = i;
			}
		}
		bw.write(maxNum + "\n");

		bw.flush();
		bw.close();
		br.close();
	}

}
