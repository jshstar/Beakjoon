import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		HashSet<String> userName = new HashSet<>();
		userName.add("ChongChong");

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String user1 = st.nextToken();
			String user2 = st.nextToken();
			if(userName.contains(user1) || userName.contains(user2)){
				userName.add(user1);
				userName.add(user2);
			}
		}

		bw.write(userName.size() + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

}

