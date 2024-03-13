import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.nextLine();
		int a = scanner.nextInt();
		System.out.println(s.split("")[a-1]);

	}
}
