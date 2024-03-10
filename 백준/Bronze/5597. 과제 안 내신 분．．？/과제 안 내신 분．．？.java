import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] answer = new int[2];
		int cnt = 0;
		Integer[] check = new Integer[30];
		for (int i = 0; i < 28; i++) {
			int a = scanner.nextInt();
			check[a-1] = a;
		}
		for (int i = 0; i < check.length; i++) {
			if(check[i] == null) {
				answer[cnt] = i+1;
				System.out.println(answer[cnt]);
				if(cnt == 1){
					break;
				}
				cnt++;
			}
		}

	}
}