import java.io.*;
import java.util.*;
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int t = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      int answer = n;
      while (true) {
        answer = Math.max(answer, n);

        if ((n & (-n)) == n) { 
          break;
        }

        if (n % 2 == 0) {
          n /= 2;
        } else {
          n = n * 3 + 1;
        }
      }
      sb.append(answer).append("\n");
    }
    bw.write(sb.toString());
    bw.flush();
    bw.close();
    br.close();
  }

}