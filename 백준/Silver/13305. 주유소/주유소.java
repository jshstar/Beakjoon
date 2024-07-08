import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		long[] distance = new long[n - 1];
		long[] oilCost = new long[n - 1];
		StringTokenizer std = new StringTokenizer(br.readLine(), " ");
		StringTokenizer sto = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n - 1; i++) {
			distance[i] = Long.parseLong(std.nextToken());
			oilCost[i] = Long.parseLong(sto.nextToken());
		}


		long sum = 0;
		long minCost = oilCost[0];
		for (int i = 0; i < n - 1; i++) {
			if(oilCost[i] < minCost){
				minCost = oilCost[i];
			}

			sum += (minCost * distance[i]);
		}

		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
		br.close();
	}

}

