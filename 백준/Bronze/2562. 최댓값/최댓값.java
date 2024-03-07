import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int max = 0;
		int count =0;
		for (int i = 0; i < 9; i++) {
			int a = scanner.nextInt();
			if(max < a) {
				max = a;
				count =i+1;
			}
		}
		System.out.println(max);
        System.out.println(count);
	}
}
