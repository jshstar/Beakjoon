import java.util.*;
import java.io.*;

public class Main {

	static int n;
	static List<String> ans;
	static String[] op = {"+", "-", " "};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			n = Integer.parseInt(br.readLine());  // 전역 변수 n 초기화
			ans = new ArrayList<>();
			dfs(1, "1");
			Collections.sort(ans);  // 사전 순 정렬
			for (String s : ans) {
				bw.write(s + "\n");
			}
			bw.write("\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}

	static void dfs(int num, String s) {
		if (num == n) {
			String expression = s.replaceAll(" ", "");  
			if (cal(expression)) {
				ans.add(s);
			}
			return;
		}
		for (int i = 0; i < 3; i++) {
			dfs(num + 1, s + op[i] + (num + 1));
		}
	}

	static boolean cal(String e) {
		List<String> tokens = new ArrayList<>();
		int len = e.length();
		StringBuilder num = new StringBuilder();

		for (int i = 0; i < len; i++) {
			char ch = e.charAt(i);
			if (ch == '+' || ch == '-') {
				tokens.add(num.toString());
				tokens.add(String.valueOf(ch));
				num = new StringBuilder();
			} else {
				num.append(ch);
			}
		}
		tokens.add(num.toString());


		int sum = Integer.parseInt(tokens.get(0));
		for (int i = 1; i < tokens.size(); i += 2) {
			String op = tokens.get(i);
			int number = Integer.parseInt(tokens.get(i + 1));
			if (op.equals("+")) {
				sum += number;
			} else if (op.equals("-")) {
				sum -= number;
			}
		}

		return sum == 0;
	}
}
