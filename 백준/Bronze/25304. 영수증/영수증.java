import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = scanner.nextInt();
		int goods = scanner.nextInt();	
		int result = 0;
		for (int i = 0; i < goods; i++) {
			int price = scanner.nextInt();
			int count = scanner.nextInt();
			result += price * count;
		}
		if(result == total){
			System.out.println("Yes");
		} else{
			System.out.println("No");
		}
		scanner.close();
	}
}