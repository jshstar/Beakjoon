import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String backS = "";
		for (int i = s.length()-1 ; i >=0 ; i--) {
			char c = s.charAt(i);
			backS += c;
		}
		if(backS.equals(s)){
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}
}