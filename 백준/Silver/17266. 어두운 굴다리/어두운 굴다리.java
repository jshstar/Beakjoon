import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		;
		List<Integer> list = new ArrayList<>();
		int start;
		int end;
		int between;
		int betweenMax = 0;
		for (int i = 0; i < m; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}

		if (m == 1) {
			start = list.get(0);
			end = n - list.get(0);
			bw.write(Math.max(start, end) + "\n");
		} else {
			start = list.get(0);
			end = n - list.get(list.size() - 1);
			for (int i = 1; i < m; i++) {
				between = list.get(i) - list.get(i - 1);
				if(betweenMax < between){
					betweenMax = between;
				}
			}
			if(betweenMax % 2 == 1){
				between = betweenMax / 2 + 1;
			} else {
				between = betweenMax / 2;
			}
			bw.write(Math.max(between, Math.max(start, end)) + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}

}


