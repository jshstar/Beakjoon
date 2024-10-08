import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		List<Point> list = new ArrayList<>();

		// 비가 올 때 물이 고이지 않도록 지붕의 어떤 부분도 오목하게 들어간 부분이 없어야 한다.
		// 내려가는 부분 없어야된다.
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			Point p = new Point(x, y);
			list.add(p);
		}
		Collections.sort(list, (x1, x2) -> x1.x -x2.x);
		Point maxPoint = list.get(0);
		int sum = 0;
		int maxX = 0;
		for (int i = 1; i < n; i++) {
			Point currentPoint = list.get(i);
			if(maxPoint.y <= currentPoint.y){
				sum += (currentPoint.x - maxPoint.x) * maxPoint.y;
				maxPoint = currentPoint;
				maxX = i;
			}
		}
		maxPoint = list.get(list.size() - 1);
		for (int i = list.size() - 2; i > maxX - 1 ; i--) {
			Point currentPoint = list.get(i);
			if(maxPoint.y <= currentPoint.y){
				sum += (maxPoint.x - currentPoint.x ) * maxPoint.y;
				maxPoint = currentPoint;
			}
		}
		sum += list.get(maxX).y;

		bw.write(sum + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

	static class Point{
		int x;
		int y;

		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
	}

}




