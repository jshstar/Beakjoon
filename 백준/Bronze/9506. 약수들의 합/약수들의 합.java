import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			List<Integer> saveList = new ArrayList<>();
			int a = sc.nextInt();
			int total = 0;
			if (a == -1)
				break;

			for (int i = 1; i <= a / 2; i++) {
				if (a % i == 0) {
					saveList.add(i);
					total += i;
				}
			}
			if (total == a) {
				System.out.print(a + " = " + "1");
				for (int i = 1; i < saveList.size(); i++) {
					System.out.print(" + " + saveList.get(i));
				}
                System.out.println();
			} else if(total != a) {
				System.out.println(a + " is NOT perfect.");
			}

		}
	}
}