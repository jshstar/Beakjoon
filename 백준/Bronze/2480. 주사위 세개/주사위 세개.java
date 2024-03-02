
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int d1 = scanner.nextInt();
		int d2 = scanner.nextInt();
		int d3 = scanner.nextInt();
		int result;
		if(d1 == d2 && d2 == d3) {
			result = 10000 + d1 * 1000;
		} else if (d1 == d2){
			result = 1000 + d1 *100;	
		} else if (d2 == d3){
			result = 1000 + d2 *100;
		} else if(d1 == d3){
			result = 1000 + d3 *100;
		} else {
			result = Math.max(Math.max(d1 , d2),d3);
			result *= 100;
		}
		System.out.println(result);

	}
}