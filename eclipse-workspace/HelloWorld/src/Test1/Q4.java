package Test1;

import java.util.HashMap;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		HashMap<String, Integer> drink = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);

		System.out.println("문제 4");

		drink.put("밀키스", 700);
		drink.put("코카콜라", 800);
		drink.put("펩시", 1000);
		drink.put("칠성사이다", 1200);

		System.out.println("밀키스, 코카콜라, 펩시, 칠성사이다 있습니다.");
		System.out.println("종료하려면 exit를 입력하십시오");
		System.out.println();

		while (true) {
			System.out.print("선택 >> ");
			String name = sc.next();

			if (name.equalsIgnoreCase("exit")) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}

			Integer price = drink.get(name);
			if (price == null) {
				System.out.println(name + "는 없습니다.");
			} else {
				System.out.println(name + " 는 " + price + "원 입니다.");
			}
		}
	}
}
