import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[10];
		int cnt = 0;
		for (int i = 0; i < 10; i++) {
			boolean flag = false;
			int a = scanner.nextInt();
			array[i] = a % 42;
			for (int j = 0; j < i; j++) {
				if(array[i] == array[j]){
					flag = true;
					break;
				}
			}
			if(!flag){
				cnt++;
			}
		}
		System.out.println(cnt);

	}
}
