import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();

		int[] array = new int[m];
		double total =0;
		int max =0;
		for (int i = 0; i < m; i++) {
			int a = scanner.nextInt();
			array[i] = a;
			if(max < a){
				max = a;
			}
		}
		for (int i = 0; i < m; i++) {
			total += (double) array[i] / max * 100;
		}
		System.out.println(total/m);
	}
}
