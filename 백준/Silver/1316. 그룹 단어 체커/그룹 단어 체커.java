import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
        scanner.nextLine();
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			String s = scanner.nextLine();
			if(check(s)){
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	static boolean check(String s){
		boolean[] checkAlphabet = new boolean[26];
		int prev = -1;
		for (int i = 0; i < s.length(); i++) {
			int now = s.charAt(i);
			if(prev != now){
				if(!checkAlphabet[now - 97]){
					checkAlphabet[now - 97] = true;
					prev = now;
				} else {
					return false;
				}
			} 
		}
		return true;
	}
}
