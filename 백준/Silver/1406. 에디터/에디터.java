import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String n = br.readLine();
		sb.append(n);
		int cursor = sb.length();
		int m = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i = 0; i < m; i++){
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			switch(s){
				case "L" :
					if(cursor > 0){
						cursor--;
					}
					break;
				case "D" :
					if(cursor < sb.length()){
						cursor++;
					}
					break;
				case "B" :
					if(cursor > 0){
						cursor--;
						sb.deleteCharAt(cursor);
					}
					break;
				case "P" :
					sb.insert(cursor, st.nextToken());
					cursor++;
					break;

			}
		}
		bw.write(sb + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

}




