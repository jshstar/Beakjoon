import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()); // 팀수
			int k = Integer.parseInt(st.nextToken()); // 문제 개수
			int t = Integer.parseInt(st.nextToken()) - 1; // 우리 팀 ID
			int m = Integer.parseInt(st.nextToken()); // 로그 개수
			int[][] team = new int[n][k];
			int[] teamScore = new int[n];
			int[] teamCnt = new int[n];
			int[] teamLog = new int[n];


			for (int j = 0; j < m; j++) {
				st = new StringTokenizer(br.readLine());
				int id = Integer.parseInt(st.nextToken()) - 1; // 팀 Id
				int num = Integer.parseInt(st.nextToken()) - 1; // 문제 번호
				int score = Integer.parseInt(st.nextToken()); // 획득 점수
				if(team[id][num] < score){
					teamScore[id] += score - team[id][num];
					team[id][num] = score;
				}
				teamCnt[id]++;
				teamLog[id] = j;
			}
			
			
			int rank =1;
			for (int j = 0; j < n; j++) {
				if(t != j){
					if(teamScore[t] < teamScore[j]){
						rank ++;
					} else if(teamScore[t] == teamScore[j]){
						if(teamCnt[t] > teamCnt[j]){
							rank++;
						} else if(teamCnt[t] == teamCnt[j]){
							if(teamLog[t] > teamLog[j]){
								rank++;
							}
						}
					}
				}
			}
			bw.write(rank + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}

}


