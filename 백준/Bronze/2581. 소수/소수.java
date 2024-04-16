import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		int min = n;
		for (int i = m; i <= n; i++) {
			boolean flag = true;
			if(i == 1) {
				flag = false;
			} else {
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						flag = false;
						break;
					}
				}
			}
			if (flag) {
				sum += i;
				if (i < min) {
					min = i;
				}
			}
		}
		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum + "\n" + min);
		}

	}
}
