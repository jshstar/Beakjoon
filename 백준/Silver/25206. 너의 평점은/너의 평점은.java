import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		double count = 0;
		for (int i = 0; i < 20; i++) {
			String object = sc.next();
			double val = sc.nextDouble();
			String grade = sc.next();
			count += val;
			switch (grade) {
				case "A+":
					sum += val * 4.5;
					break;
				case "A0":
					sum += val * 4.0;
					break;
				case "B+":
					sum += val * 3.5;
					break;
				case "B0":
					sum += val * 3.0;
					break;
				case "C+":
					sum += val * 2.5;
					break;
				case "C0":
					sum += val * 2.0;
					break;
				case "D+":
					sum += val * 1.5;
					break;
				case "D0":
					sum += val * 1.0;
					break;
				case "F":
					sum += val * 0;
					break;
				case "P":
					count -= val;
					break;
			}
		}
		System.out.println(sum / count);
		sc.close();
	}
}