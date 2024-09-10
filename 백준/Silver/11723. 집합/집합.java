import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		HashSet<Integer> set = new HashSet<>();
		int m = Integer.parseInt(br.readLine());
		int bitset = 0;
		while(m --> 0) {
		    st = new StringTokenizer(br.readLine(), " ");
			int num = 0;
			String op = st.nextToken();


			switch(op){
				case "add" :
					num = Integer.parseInt(st.nextToken());
					bitset |= 1 << (num - 1);
					break;
				case "remove" :
					num = Integer.parseInt(st.nextToken());
					bitset = bitset & ~(1 << (num - 1));
					break;
				case "check" :
					num = Integer.parseInt(st.nextToken());
					if((bitset & (1 << (num - 1))) != 0){
						bw.write(1 + "\n");
					} else {
						bw.write( 0 + "\n");
					}
					break;
				case "toggle" :
					num = Integer.parseInt(st.nextToken());
					bitset ^= (1 << (num - 1));
					break;
				case "all" :
					bitset |= (~0);
					break;
				case "empty" :
					bitset &= 0;
					break;
			}


		}



		bw.flush();
		bw.close();
		br.close();
	}
}
