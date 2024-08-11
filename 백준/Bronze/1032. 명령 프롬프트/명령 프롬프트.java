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
		int n = Integer.parseInt(br.readLine());
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = br.readLine();
		}
		boolean flag = true;

		for (int i = 0; i < str[0].length(); i++) {
			for (int j = 0; j < n; j++) {
				if (str[0].charAt(i) != str[j].charAt(i)) {
					flag = false;
					break;
				}
			}
			if(flag){
				bw.write(str[0].charAt(i));
			} else {
				bw.write('?');
				flag = true;
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}

}

