import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		StringBuffer sb = new StringBuffer(); 
		int[] basket = new int[n];
		for (int i = 0; i < m; i++) {
			int start = scanner.nextInt();
			int end = scanner.nextInt();
			int num = scanner.nextInt();
			for (int j = start-1; j < end; j++) {
				basket[j] = num;
			}
 		}
		for (int i = 0; i < n; i++) {
			sb.append(basket[i]).append(" "); 
		}
		System.out.println(sb);
	}
}