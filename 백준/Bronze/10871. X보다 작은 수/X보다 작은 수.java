import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int target = scanner.nextInt();
		StringBuilder sb = new StringBuilder();
		int[] array = new int[n];
		for(int i = 0; i < n; i++){
			int a = scanner.nextInt();
			array[i] = a;
			if(array[i] < target){
				sb.append(String.valueOf(array[i])).append(" ");
			}
		}
		System.out.println(sb);

	}
}