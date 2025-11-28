package Test1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문제 2");
		System.out.println("종료하려면 exit를 입력하십시오");
		System.out.println();

		while (true) {
			String name = sc.nextLine();
			if (name.equalsIgnoreCase("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			String[] w = name.split(",");

			int count = 0;
			for (String word : w) {
				if (!word.trim().isEmpty()) {
					count++;
				}
			}
			System.out.println("어절 개수는 " + count);
		}
	}
}
