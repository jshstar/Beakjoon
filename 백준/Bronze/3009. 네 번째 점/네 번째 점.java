import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] xArr = new int[3];
		int[] yArr = new int[3];
		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			xArr[i] = Integer.parseInt(st.nextToken());
			yArr[i] = Integer.parseInt(st.nextToken());
		}
		int x4 = 0;
		int y4 = 0;
		Arrays.sort(xArr);
		Arrays.sort(yArr);
		if(xArr[1] != xArr[2]){
			x4 = xArr[2];
		} else {
			x4 = xArr[0];
		}
		if(yArr[1] != yArr[2]){
			y4 = yArr[2];
		} else {
			y4 = yArr[0];
		}
		System.out.println(x4 + " " + y4);
		br.close();
	}
}
