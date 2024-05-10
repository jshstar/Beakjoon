import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int xl = w - x;
		int yl = h - y;
		int min = w;
		int[] arr = new int[] {x, y, w, h, xl, yl};
		for (int i = 0; i < arr.length ; i++) {
			if(arr[i] < min){
				min = arr[i];
			}
		}
		System.out.println(min);
		br.close();
	}
}