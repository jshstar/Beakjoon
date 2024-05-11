import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

		int[] xArr = new int[3];
		int[] yArr = new int[3];
		for (int i = 0; i < 3; i++) {
			xArr[i] = sc.nextInt();
			yArr[i] = sc.nextInt();
		}
		int x4 = 0;
		int y4 = 0;
		Arrays.sort(xArr);
		Arrays.sort(yArr);
		if(xArr[1] != xArr[2]){
			x4 = xArr[2];
		} else {
			x4 = xArr[0];
		}
		if(yArr[1] != yArr[2]){
			y4 = yArr[2];
		} else {
			y4 = yArr[0];
		}
		System.out.println(x4 + " " + y4);
	}
}
