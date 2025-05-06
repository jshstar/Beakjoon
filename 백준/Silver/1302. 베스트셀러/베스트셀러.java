import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		HashMap<String, Integer> map = new HashMap<>();

		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++){
			String bookName = br.readLine();
			map.put(bookName, map.getOrDefault(bookName, 0) + 1);
		}

		int max = 0;
		String answer = "";
		for(String key : map.keySet()){
			int val = map.get(key);
			if(max < val){
				answer = key;
				max = val;

			}  else if(val == max){
				ArrayList<String> list = new ArrayList<>();
				list.add(answer);
				list.add(key);
				Collections.sort(list);
				if(list.get(0).equals(key))
					answer = key;
			}
		}

		bw.write(answer);

		bw.flush();
		bw.close();
		br.close();
	}

}
