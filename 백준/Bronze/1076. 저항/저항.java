import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String color1 = br.readLine();
		String color2 = br.readLine();
		String color3 = br.readLine();
		HashMap<String,String> map = new HashMap<>(){{
			put("black","0");
			put("brown", "1");
			put("red", "2");
			put("orange", "3");
			put("yellow", "4");
			put("green", "5");
			put("blue", "6");
			put("violet", "7");
			put("grey", "8");
			put("white", "9");
		}};
		long result = Long.parseLong(map.get(color1) + map.get(color2));
		result *= (long)Math.pow(10.0, (double) Integer.parseInt(map.get(color3)));
		bw.write(result + "\n");
		bw.flush();
		bw.close();
		br.close();
	}



}

