import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String[] arrayS = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		for (String array : arrayS) {
			if (s.contains(array)) {
				s = s.replace(array,"@");
			}
		}
		System.out.println(s.length());
	}
}
