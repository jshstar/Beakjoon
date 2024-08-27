import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	static char[] lineArr;

	public static void main(String[] args)throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;

		String input; 

		while ((input = br.readLine()) != null) {
			int N = Integer.parseInt(input);
			sb = new StringBuilder();
			int len = (int) Math.pow(3, N);
			lineArr = new char[len];
			Arrays.fill(lineArr, '-'); 

			divide(0, len); 

			for(int i = 0; i < lineArr.length; i++){
				sb.append(lineArr[i]);
			}
			System.out.println(sb);
		}
		br.close();
	}
	
	static void divide(int start, int length) {
		if(length <= 1){
			return;
		}
		
		int newlength = length/3;
		
		for(int i = start+newlength; i < start+newlength*2; i++){
			lineArr[i] = ' ';
		}


		divide(start, newlength);
		
		divide(start+newlength*2, newlength);
	}


}

