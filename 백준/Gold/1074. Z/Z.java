import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static int cnt, r, c = 0;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		find((int)Math.pow(2, n), 0, 0);

		bw.flush();
		bw.close();
		br.close();

	}

	static void find(int size, int x, int y) throws IOException {
		if (x == r && y == c) {
			bw.write(String.valueOf(cnt));
			return;
		}

		if (r < x + size && r >= x && c < y + size && c >= y) {
			int newSize = size / 2;
			find(newSize, x, y);
			find(newSize, x, y + newSize);
			find(newSize, x + newSize, y);
			find(newSize, x + newSize, y + newSize);
		} else {
			cnt += size * size;
		}

	}

}


