import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int result = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < 7; i++) {
			int num = Integer.parseInt(br.readLine());
			if (num % 2 != 0) {
				result += num;
				if (num < min) {
					min = num;
				}
			}

		}
		if (min == Integer.MAX_VALUE) {
			bw.write(-1 + "\n");
		} else {
			bw.write(result + "\n");
			bw.write(min + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}

}
