import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		int copy = n;
		while(true){
			n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
			cnt++;
			if(copy == n){
				break;
			}

		}
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
		br.close();
	}
}
