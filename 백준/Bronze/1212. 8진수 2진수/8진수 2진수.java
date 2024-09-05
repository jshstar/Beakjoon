import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String octat_num = br.readLine();

		for(int i=0; i<octat_num.length(); i++){
			int target = octat_num.charAt(i) - '0';
			String s = Integer.toBinaryString(target);
			if(s.length() == 3){
				sb.append(s);
			}
			else if(s.length()==2 && i!=0){
				sb.append("0").append(s);
			}
			else if(s.length()==1 && i!=0){
				sb.append("00").append(s);
			}
			else
				sb.append(s);
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();

	}
}