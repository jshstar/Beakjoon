import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int mean = 0;
		int median = 0;
		int mode = 0;
		int range = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			mean += arr[i];
		}
		Arrays.sort(arr);
		mean = Math.round((float)mean /n);
		median = arr[n / 2];
		mode = findMode(arr);
		range = Math.abs(arr[n -1] - arr[0]);
		bw.write(mean + "\n");
		bw.write(median + "\n");
		bw.write(mode + "\n");
		bw.write(range + "\n");

		bw.flush();
		bw.close();
		br.close();
	}
	static int findMode(int[] arr){
		HashMap<Integer,Integer> map = new HashMap<>();
		if(arr.length == 1){
			return arr[0];
		}
		for (int j : arr) {
			map.put(j, map.getOrDefault(j, 0) + 1);
		}
		int maxValue = Collections.max(map.values());
		List<Integer> list = new ArrayList<>();
		for (Integer key : map.keySet()) {
			if(map.get(key) == maxValue){
				list.add(key);
			}
		}
		Collections.sort(list);
		if(list.size() > 1){
			return list.get(1);
		} else {
			return list.get(0);
		}
	}

}

