import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		int firstIndex = scanner.nextInt();
		array[0] = firstIndex;
		int max = firstIndex;
		int min = firstIndex;
		for(int i = 1; i<n; i++) {
			int index = scanner.nextInt();
			array[i] = index;
			if(max < array[i]){
				max = array[i];
			}
			if(min > array[i]){
				min = array[i];
			}
		}
		System.out.println(min + " " + max);
	}
}
