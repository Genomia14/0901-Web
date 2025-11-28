package Test1;

import java.util.HashMap;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		HashMap<String, Integer> bankbook = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("문제 3");
		System.out.println("<< 통장 관리 프로그램입니다. >>");
		System.out.println("종료하려면 exit를 입력하십시오");
		System.out.println();

		while (true) {
			System.out.print("이름과 금액 입력 >> ");
			String info = sc.nextLine();
			if (info.equalsIgnoreCase("exit")) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}

			String[] money = info.split(" ");
			if (money.length != 2) {
				System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
				continue;
			}

			String name = money[0];
			int amount = Integer.parseInt(money[1]);

			bankbook.put(name, bankbook.getOrDefault(name, 0) + amount);
// 맵을 반복하여 데이터를 출력하는 방식
			for (String cus : bankbook.keySet()) {
				System.out.print("(" + cus + ">" + bankbook.get(cus) + "원)");
			}
			System.out.println();
		}
	}
}
