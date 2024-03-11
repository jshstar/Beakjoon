import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		StringBuilder sb = new StringBuilder();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = i + 1;
		}
		for (int i = 0; i < m; i++) {
			int a = scanner.nextInt() - 1;
			int b = scanner.nextInt() - 1;
			while (a < b) {
				int temp = array[a];
				array[a++] = array[b];
				array[b--] = temp;
			}
		}
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i]).append(" ");
		}
		System.out.println(sb);

	}
}
