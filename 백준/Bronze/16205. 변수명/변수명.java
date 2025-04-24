import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		String num = st.nextToken();
		String text = st.nextToken();

		bw.write(camel(text) + "\n");
		bw.write(snake(text) + "\n");
		bw.write(pascal(text) + "\n");

		bw.flush();
		bw.close();
		br.close();
	}

	public static String camel(String text) {
		String tmp = "";
		boolean check = false;
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if(i == 0){
				tmp += String.valueOf(c).toLowerCase();
				continue;
			}
			if(c == '_'){
				check = true;
				continue;
			}
			if(check){
				tmp += String.valueOf(c).toUpperCase();
				check = false;
				continue;
			}
			tmp += c;
		}
		return tmp;
	}

	public static String snake(String text){
		String tmp = "";
		boolean check = false;
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if(c == '_'){
				check = true;
				tmp += c;
				continue;
			}
			if(check){
				tmp += String.valueOf(c).toLowerCase();
				check = false;
				continue;
			}
			if(c >= 'A' && c <= 'Z'){
				if(i == 0){
					tmp += String.valueOf(c).toLowerCase();
				} else {
					tmp += "_" + String.valueOf(c).toLowerCase();
				}

				continue;
			}

			tmp += c;

		}

		return tmp;
	}

	public static String pascal(String text){
		String tmp = "";
		boolean check = false;
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if(c == '_'){
				check = true;
				continue;
			}
			if(check){
				tmp += String.valueOf(c).toUpperCase();
				check = false;
				continue;
			}
			if(i == 0){
				tmp += String.valueOf(c).toUpperCase();
				continue;
			}

			tmp += c;
		}
		return tmp;

	}


}
