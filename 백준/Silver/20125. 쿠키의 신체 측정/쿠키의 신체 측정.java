import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static boolean[][] cookie;
	static int n;
	static int headX, headY;
	static int heartX, heartY;
	static int leftArm = 0, rightArm = 0, waist = 0, leftLeg = 0, rightLeg = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		cookie = new boolean[n][n];
		boolean head = false;
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < n; j++) {
				char c = s.charAt(j);
				if (c == '*') {
					cookie[i][j] = true;
					if (!head) {
						head = true;
						headY = i;
						headX = j;
					}
				}
			}
		}
		heartY = headY + 1;
		heartX = headX;
		armLength();
		waistLength();
		LeftAndRightLength();
		bw.write((heartY + 1) + " " + (heartX + 1) + "\n");
		bw.write(leftArm + " " + rightArm + " " + waist + " " + leftLeg + " " + rightLeg + "\n");

		bw.flush();
		bw.close();
		br.close();
	}

	static void armLength() {
		for (int i = 0; i < n; i++) {
			if (i < heartX && cookie[heartY][i]) {
				leftArm++;
			} else if (i > heartX && cookie[heartY][i]) {
				rightArm++;
			}
		}
	}

	static void waistLength() {
		for (int i = heartY + 1; i < n; i++) {
			if (cookie[i][heartX]) {
				waist++;
			}
		}
	}

	static void LeftAndRightLength(){
		for (int i = heartY + waist + 1; i < n; i++) {
			if(cookie[i][heartX - 1]){
				leftLeg++;
			}
			if(cookie[i][heartX + 1]){
				rightLeg++;
			}
		}
	}

}


