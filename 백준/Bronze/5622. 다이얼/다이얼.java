import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int time = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int a;
			if(c == 'S' || c == 'V'|| c == 'Y' ) {
				a = c - 'A' - 1;
			} else if( c == 'Z') {
				a = c - 'A' - 2;
			}
			else {
				a = c - 'A';
			}

			time += a/3+3;
		}
		System.out.println(time);
	}
}
