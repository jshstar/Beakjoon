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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Info[] infos = new Info[n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String title = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			infos[i] = new Info(title, num);
		}

		for (int i = 0; i < m; i++) {
			int power = Integer.parseInt(br.readLine());
			int left = 0;
			int right = infos.length - 1;

			while (left <= right) {
				int mid = (left + right) / 2;
				if (infos[mid].getNum() < power){
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
			bw.write(infos[left].getTitle() + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}

	static class Info {
		private String title;
		private int num;

		public Info(String title, int num) {
			this.title = title;
			this.num = num;
		}

		String getTitle() {
			return this.title;
		}

		long getNum() {
			return this.num;
		}

	}
}




