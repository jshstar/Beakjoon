import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int score = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int[] rankList = new int[n];
		int rank = 1;
		int rankCheck =0;
		if(n == 0){
			bw.write(1 + "\n");
		} else {
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				rankList[i] = Integer.parseInt(st.nextToken());
			}

			for (int i = 0; i < n; i++) {
				if(score <= rankList[i]){
					rankCheck ++;
					if(score < rankList[i]){
						rank++;
					}
				}
			}
			if(p == rankCheck){
				bw.write(-1 + "\n");
			} else {
				bw.write(rank + "\n");
			}
		}



		bw.flush();
		bw.close();
		br.close();
	}



}


