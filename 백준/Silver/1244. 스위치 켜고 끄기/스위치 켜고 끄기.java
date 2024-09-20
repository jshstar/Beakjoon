import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] button = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			button[i] = Integer.parseInt(st.nextToken());
		}
		int student = Integer.parseInt(br.readLine());
		for (int i = 0; i < student; i++) {
			st = new StringTokenizer(br.readLine());
			String gender = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			if (gender.equals("1")) {
				for (int j = num; j <= n; j += num) {
					if (button[j] == 1) {
						button[j] = 0;
					} else {
						button[j] = 1;
					}
				}
			} else {
				int isBNum = 0;
				for (int j = 1; j <= n; j++) {
					if (num + j <= n && num - j >= 1) {
						if (button[num + j] != (button[num - j])) {
							isBNum = j - 1;
							break;
						}
					} else {
						isBNum = j - 1;
						break;
					}
				}
				if(isBNum == 0){
					if (button[num] == 1) {
						button[num] = 0;
					} else {
						button[num] = 1;
					}
				} else {
					for (int k = num - isBNum; k <= num + isBNum; k++) {
						if (button[k] == 1) {
							button[k] = 0;
						} else {
							button[k] = 1;
						}
					}
				}
			}
		}
		for (int i = 1; i <= n; i++) {
			if(i % 20 == 0){
				bw.write(button[i] + "\n");
			} else {
				bw.write(button[i] + "\n");
			}
			
		}

		bw.flush();
		bw.close();
		br.close();
	}

}


