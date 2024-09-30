import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int zero = 0;
		int one = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			sb.append(c);
			if(c == '0'){
				zero++;
			} else{
				one++;
			} 
		}
		
		zero /= 2;
		one /= 2;

		for (int i = 0; i < sb.length(); i++) {
			if(sb.charAt(i) == '1'){
				sb.setCharAt(i, 'X');
				one--;
			}
			if(one == 0){
				break;
			}
		}

		for (int i = sb.length() - 1; i > -1; i--) {
			if(sb.charAt(i) == '0'){
				sb.setCharAt(i, 'X');
				zero--;
			}
			if(zero == 0){
				break;
			}
		}

		for (int i = 0; i < sb.length(); i++) {
			char c = sb.charAt(i);
			if(c == '1' || c == '0'){
				bw.write(c);
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

}


