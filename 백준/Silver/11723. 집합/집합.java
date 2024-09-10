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
		int num = 0;

		for (int i = 0; i < m; i++) {
		    st = new StringTokenizer(br.readLine(), " ");
			String cal = st.nextToken();
			if(!cal.equals("all") && !cal.equals("empty")){
				num = Integer.parseInt(st.nextToken());
			}

			switch(cal){
				case "add" :
					set.add(num);
					break;
				case "remove" :
					set.remove(num);
					break;
				case "check" :
					if(set.contains(num)){
						bw.write(1 + "\n");
					} else {
						bw.write( 0 + "\n");
					}
					break;
				case "toggle" :
					if(set.contains(num)){
						set.remove(num);
					} else {
						set.add(num);
					}
					break;
				case "all" :
					for (int j = 1; j <=20 ; j++) {
						set.add(j);
					}
					break;
				case "empty" :
					set.clear();
					break;
			}


		}

		bw.flush();
		bw.close();
		br.close();
	}
}
