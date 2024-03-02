import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int result;
		for (int i = 1; i <= 9; i++) {
			result = num * i;
			System.out.println(num + " * " + i + " = " + result);
		}
		scanner.close();
	}
}
