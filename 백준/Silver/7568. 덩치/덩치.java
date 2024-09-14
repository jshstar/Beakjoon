import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		List<PersonalInfo> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			PersonalInfo person = new PersonalInfo();
			person.setWeight(Integer.parseInt(st.nextToken()));
			person.setHeight(Integer.parseInt(st.nextToken()));
			list.add(person);
		}

		for (int i = 0; i < n; i++) {
			int rank = 1;
			for (int j = 0; j < n; j++) {
				if (i != j) {
					if (list.get(i).getWeight() < list.get(j).getWeight()
						&& list.get(i).getHeight() < list.get(j).getHeight()) {
						rank++;
					}
				}
			}
			bw.write(rank + " ");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}

class PersonalInfo {
	int height;
	int weight;

	public int getHeight() {
		return this.height;
	}

	public int getWeight() {
		return this.weight;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
