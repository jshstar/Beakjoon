import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		String s = br.readLine();

		int answer = 0;
		int count = 0;

		for (int i = 0; i < m; i++) {
			if(i + 2 >= m){
				break;
			}

			if(s.charAt(i) == 'I' && s.charAt(i + 1) == 'O' && s.charAt(i + 2) == 'I'){
				count++;
				i++;

				if(count == n){
					answer++;
					count--;
				}
			} else {
				count =0;
			}
		}

		bw.write(String.valueOf(answer));

		bw.flush();
		bw.close();
		br.close();

	}

}


