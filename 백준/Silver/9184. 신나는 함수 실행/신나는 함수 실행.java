import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int[][][] arr = new int[21][21][21];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if (a == -1 && b == -1 && c == -1) {
				break;
			}
			bw.write( "w(" + a + ", " + b + ", " + c + ") = " + w(a,b,c) + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}

	static int w(int a, int b, int c) {
		if(valCheck(a ,b ,c) && arr[a][b][c] != 0) {
			return arr[a][b][c];
		}
		else if (a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}
		else if (a > 20 || b > 20 || c > 20) {
			return arr[20][20][20] = w(20, 20, 20);
		}
		else if (a < b && b < c) {
			return arr[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
		}

		return arr[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
	}
	static boolean  valCheck(int a, int b, int c){
		return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20;
	}

}

