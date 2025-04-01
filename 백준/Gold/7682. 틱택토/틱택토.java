import java.util.*;
import java.io.*;

public class Main {
	
	static char[][] table;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int xCnt, oCnt;
		while (true) {
			String s = br.readLine();
			if (s.equals("end")) {
				break;
			}
			xCnt = 0;
			oCnt = 0;
			table = new char[3][3];
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				table[j / 3][j % 3] = c;
				if (c == 'X') {
					xCnt++;
				} else if(c == 'O'){
					oCnt++;
				}
			}
			if (oCnt + xCnt == 9 && xCnt - oCnt == 1) {
				if (check('X') && check('O')) {
					bw.write("invalid\n");
				} else if (check('O')) {
					bw.write("invalid\n");
				} else {
					bw.write("valid\n");
				}
			} else {
				if (check('X') && check('O')) {
					bw.write("invalid\n");
				} else if (check('X') && xCnt - oCnt == 1) {
					bw.write("valid\n");
				} else if (check('O') && xCnt == oCnt) {
					bw.write("valid\n");
				} else {
					bw.write("invalid\n");
				}

			}
		}

		bw.flush();
		bw.close();
		br.close();
	}

	static boolean check(char type) {

		for (int i = 0; i < 3; i++) {
			int cnt = 0;
			for (int j = 0; j < 3; j++) {
				if (table[i][j] == type) {
					cnt++;
				}

			}
			if (cnt == 3) {
				return true;
			}

		}
		for (int j = 0; j < 3; j++) {
			int cnt = 0;
			for (int i = 0; i < 3; i++) {
				if (table[i][j] == type) {
					cnt++;
				}
			}
			if (cnt == 3) {
				return true;
			}

		}

		if (table[0][0] == type && table[1][1] == type
			&& table[2][2] == type) {
			return true;
		}

		if (table[0][2] == type && table[1][1] == type
			&& table[2][0] == type) {
			return true;
		}

		return false;

	}

}
