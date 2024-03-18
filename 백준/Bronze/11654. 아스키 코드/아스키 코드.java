import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.nextLine();
		char c = s.charAt(0);
		System.out.println(Integer.valueOf(c));

	}
}