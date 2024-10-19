import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();

		int aCnt = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'a') {
				aCnt++;
			}
		}

		for (int i = 0; i < s.length(); i++) {
			int bCnt = 0;
			for (int j = 0; j < aCnt; j++) {
				if (s.charAt((i + j) % s.length()) == 'b'){
					bCnt++;
				}
			}
			min = Math.min(min, bCnt);
		}

		bw.write(String.valueOf(min));
		bw.flush();
		bw.close();
		br.close();

	}

}






