import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		for (int i = 0; i < num; i++) {
			StringBuffer sb = new StringBuffer();
			int cnt = scanner.nextInt();
			String s = scanner.next();
			scanner.nextLine();
			String[] arrays = s.split("");
			for (int j = 0; j < arrays.length; j++) {
				for (int k = 0; k < cnt; k++) {
					sb.append(arrays[j]);
				}
			}
			System.out.println(sb);
		}
	}
}