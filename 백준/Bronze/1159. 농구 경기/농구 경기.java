import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[26];
        int n = Integer.parseInt(br.readLine());  
        boolean possible = false;  
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            char c = name.charAt(0);  
            arr[c - 97]++;  
            if (arr[c - 97] == 5) possible = true;  
        }
        if (possible) {
            for (int i = 0; i < 26; i++) {
                if (arr[i] >= 5) System.out.print((char)(i+97));
            }
        } else {
            bw.write("PREDAJA\n");
        }
        
        bw.flush();
		bw.close();
		br.close();

    }
}