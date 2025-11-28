package Test1;

import java.util.HashMap;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);

		System.out.println("문제 5");

		System.out.println("나라 이름과 인구를 5개 입력하세요. (예: Korea 5000)");
		System.out.println("종료하려면 exit를 입력하십시오");
		System.out.println();

		for (int i = 0; i < 5; i++) {
			System.out.print("나라 이름, 인구 >> ");
			String name = sc.next();

			if (name.equalsIgnoreCase("exit")) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}

			int pop1 = sc.nextInt();
			nations.put(name, pop1);
		}

		String MinCo = null;
		int MinPop = Integer.MAX_VALUE;

		for (String Co : nations.keySet()) {
			int pop2 = nations.get(Co);
			if (pop2 < MinPop) {
				MinPop = pop2;
				MinCo = Co;
			}
		}
		System.out.println("제일 인구가 적은 나라는 (" + MinCo + ", " + MinPop + ")");

	}
}
