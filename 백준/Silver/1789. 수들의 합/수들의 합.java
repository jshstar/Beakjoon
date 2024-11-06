import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long num = Long.parseLong(br.readLine());
        long sum = 0;
		int count = 0;
		
		for(int i=1; ; i++) {
			if(sum > num)	break;
			sum += i;
			count ++;
		}
		bw.write(String.valueOf(count-1) );
        bw.flush();
		bw.close();
		br.close();
	}

}