import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			String s = br.readLine();
			int k = Integer.parseInt(br.readLine());
			char[] alpha = new char[26];
            if(k == 1){
                bw.write("1 1" + "\n");
                continue;
            }
            
			for (int j = 0; j < s.length(); j++) {
				alpha[s.charAt(j) - 'a']++;
			}
			int min = Integer.MAX_VALUE;
			int max = -1;
			for(int j = 0; j < s.length(); j++){
				if(alpha[s.charAt(j) - 'a'] < k){
					continue;
				}
				int cnt = 1;
				for (int l = j + 1 ; l < s.length(); l++){
					if(s.charAt(j) == s.charAt(l)){
						cnt ++;
					}
					if(cnt == k){
						max = Math.max(max, l - j + 1);
						min = Math.min(min, l - j + 1);
						break;
					}
				}
			}
			if(min == Integer.MAX_VALUE || max == -1 ){
				bw.write("-1" + "\n");
			} else {
				bw.write(min + " " + max + "\n");
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}


}
