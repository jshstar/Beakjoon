import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			long k = Long.parseLong(br.readLine());
			if(k <= 2) {
				bw.write(2 + "\n");
				continue;
			}
			while(true){
				boolean flag = true;
				for (int j = 2; j <= Math.sqrt(k) + 1 ; j++) {
					if(k % j == 0){
						flag = false;
						break;
					}
				}
				if(flag){
					bw.write(k + "\n");
					break;
				}
				k++;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

}

