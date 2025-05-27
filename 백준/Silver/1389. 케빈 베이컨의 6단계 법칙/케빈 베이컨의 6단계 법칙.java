import java.util.*;
import java.io.*;

public class Main {
	
	static int n, m;
	static int[][] rel;
	static final int maxVal = 999999999;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		rel = new int[n+1][n+1]; 
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				rel[i][j] = maxVal;
				if(i == j) rel[i][j] = 0;
			}
		}
		
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			rel[a][b] = 1; 
			rel[b][a] = 1;
		}
		
		for(int k=1;k<=n;k++) { 
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					rel[i][j] = Math.min(rel[i][j], rel[i][k]+rel[k][j]);
				}
			}
		}
		int temp = maxVal;
		int result = 0;
		for(int i=1;i<=n;i++) {
			int total = 0;
			for(int j=1;j<=n;j++) {
				total += rel[i][j];
			}
			
			if(temp > total) { 
				temp = total;
				result = i;
			}	
		}
		
		bw.write(result+"");
		bw.flush();
		bw.close();
	}

}