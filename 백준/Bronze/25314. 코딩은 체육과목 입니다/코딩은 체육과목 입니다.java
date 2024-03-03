import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		StringBuilder type = new StringBuilder();
		for (int i = 0; i < n/4; i++) {
			type.append("long ");
		}
		type.append("int");
		System.out.println(type);
		scanner.close();
	}
}
