import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		String num = scanner.next();
		scanner.nextLine();
		String[] arrayS = num.split("");
		int total = 0;
		for (int i = 0; i < arrayS.length; i++) {
			total += Integer.parseInt(arrayS[i]);
		}
		System.out.println(total);

	}
}