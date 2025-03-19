import java.util.*;
import java.io.*;

public class Main {

	static long c;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());

		c = Long.parseLong(st.nextToken());

		bw.write(String.valueOf(pow(a, b)));
		bw.flush();
		bw.close();
		br.close();

	}

	public static long pow(long a, long ex) {
		if (ex == 1) {
			return a % c;
		}

		long tmp = pow(a, ex / 2);

		if(ex % 2 == 1){
			return (tmp * tmp % c) * a % c;
		}
		return  tmp * tmp % c;

	}

}


