package Test2;

public class Q4 {

	public static void main(String[] args) {
		System.out.println("문제 4");
		
		int[][] scores = { { 80, 60, 70 }, { 90, 95, 80 },
			                 { 75, 80, 100 }, { 80, 70, 95 }, { 100, 65, 80 } };
		System.out.println("학생번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=============================================");

		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}

			double avg = (double) sum / scores[i].length;
			avg = (int) avg;

			System.out.print((i + 1) + "번 학생:\t");

			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}

			System.out.println(sum + "\t" + (double) avg);
		}
	}
}
