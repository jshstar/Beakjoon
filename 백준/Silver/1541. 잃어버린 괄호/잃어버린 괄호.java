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
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		int ans = Integer.MAX_VALUE;
		while(st.hasMoreTokens()){
			int temp = 0;
			StringTokenizer str = new StringTokenizer(st.nextToken(), "+");
			while(str.hasMoreTokens()){
				temp += Integer.parseInt(str.nextToken());
			}
			if(ans == Integer.MAX_VALUE){
				ans = temp;
			} else {
				ans -= temp;
			}

		}
		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
		br.close();
	}

}

