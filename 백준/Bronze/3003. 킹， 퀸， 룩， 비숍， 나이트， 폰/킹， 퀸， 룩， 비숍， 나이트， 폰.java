import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String[] arrayS = s.split(" ");
		int[] c = {1,1,2,2,2,8};
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arrayS.length; i++) {
			sb.append(c[i] - Integer.parseInt(arrayS[i])).append(" ");
		}
		System.out.println(sb);
	}
}
