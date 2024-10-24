import java.io.*;
import java.util.*;

public class Main {
	static String s;
	static String t;
	static int answer = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		s = br.readLine();
		t = br.readLine();

		dfs(t);
		bw.write(String.valueOf(answer));

		bw.flush();
		bw.close();
		br.close();

	}

	static void dfs(String t){
		int lengthT = t.length();
		if(lengthT == s.length()){
			if(t.equals(s)){
				answer = 1;
			}
			return;
		}
		if(t.endsWith("A")){
			dfs(t.substring(0, lengthT - 1));
		}
		if(t.startsWith("B")){
			dfs(new StringBuilder(t.substring(1)).reverse().toString());
		}
	}


}






