import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] doubleArrays1 = new int[n][m];
		int[][]	doubleArrays2 = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				doubleArrays1[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				doubleArrays2[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(doubleArrays1[i][j] + doubleArrays2[i][j] + " ");
				if(j == m-1){
					System.out.println();
				}
			}
		}
	}

}