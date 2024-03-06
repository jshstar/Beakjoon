import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int cnt = 0;
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			int a = scanner.nextInt();
			array[i] = a;
		}
		int target =scanner.nextInt();
		for (int i = 0; i < n; i++) {
			if(array[i] == target) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
}