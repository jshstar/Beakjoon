import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int m = scanner.nextInt();
		int cM = scanner.nextInt();

		h += cM / 60;
		m += cM % 60;
		
		if(m >= 60) {
			h += 1;
			m -= 60;
		}

		if(h > 23){
			h -= 24;
		}
		
		System.out.println(h + " " + m);
	}
}
