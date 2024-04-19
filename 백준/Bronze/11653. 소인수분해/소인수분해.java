import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		while (true) {
			boolean flag = false;
			for (int i = 2; i <= n; i++) {
				if (n % i == 0) {
					n /= i;
					list.add(i);
					flag = true;
					break;
				}
			}
			if (!flag) {
				break;
			}
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}