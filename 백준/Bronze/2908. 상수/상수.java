import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String[] arrays = s.split(" ");
		for (int i = 0; i < arrays.length; i++) {
			String num = "";
			for (int j = arrays[i].length()-1; j >= 0 ; j--) {
				char c = arrays[i].charAt(j);
				num += c;
			}
			arrays[i] = num;
		}
		int max = Math.max(Integer.parseInt(arrays[0]),Integer.parseInt(arrays[1]));
		System.out.println(max);
	}
}
