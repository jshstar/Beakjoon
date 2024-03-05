import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		char[] starArray = new char[n];
		for (int j = 0; j < n-1; j++) {
			starArray[j] = ' ';
		}
		for(int i = n-1; i >= 0; i--) {
			
			starArray[i] = '*';
			String star = String.valueOf(starArray);
			System.out.println(star);
		}
		scanner.close();

	}
}
