import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		StringBuffer sb = new StringBuffer();
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int temp;
		int[] basket = new int[n];
		for (int i = 1; i <= n; i++) {
			basket[i-1] = i;
		}
		for (int i = 0; i < m; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			temp = basket[a-1];
			basket[a-1] = basket[b-1];
			basket[b-1] = temp;
		}
		for (int i = 0; i < basket.length; i++) {
			sb.append(basket[i]).append(" ");
		}
		System.out.println(sb);
	}
}
