import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			String s = scanner.next();
			scanner.nextLine();
			String firstS = s.substring(0,1);
			String lastS = s.substring(s.length()-1);
			System.out.println(firstS + lastS);
		}
		
	}
}
