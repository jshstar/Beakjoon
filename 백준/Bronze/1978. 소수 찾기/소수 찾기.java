import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			boolean flag = false;
			if (num != 1) {
				for (int j = 2; j <= num / 2; j++) {
					if (num % j == 0) {
						flag = true;
					}
				}
				if (!flag) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
