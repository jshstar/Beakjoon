import java.util.*;
import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;
		
		for(int i = 0; i < 5; i++) {
			int car = Integer.parseInt(st.nextToken());
			if(car == n) {
				count++;
			}
		}
		bw.write(count + "\n");
        bw.flush();
		bw.close();
		br.close();
	}

}