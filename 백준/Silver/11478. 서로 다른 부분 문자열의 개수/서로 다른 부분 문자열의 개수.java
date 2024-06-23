import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		Set<String> sMap = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length() - i; j++) {
				sMap.add(s.substring(j, j + i + 1));
			}
		}
		bw.write(String.valueOf(sMap.size()));
		bw.flush();
		bw.close();
		br.close();
	}
}

