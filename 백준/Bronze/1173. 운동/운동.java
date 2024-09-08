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
		int N = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		int mix = m;
		int cnt = 0;
		
		//운동을 한번도 못할 경우 -1 출력
		if((M - m) < T) {
			System.out.println(-1);
		}else {
			//무한루프
			while(true) {
				
				if((m + T) <= M) {
					m += T;
					N--;
				}else {
					m -= R;
				}
				
				if(m < mix) {
					m = mix;
				}
				
				cnt++;
				if(N == 0) break;
			}
			bw.write(cnt + "\n");
            bw.flush();
            bw.close();
            br.close();
		}
	}

}