package Practice8;

import java.util.HashMap;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
//		2. “그만”이 입력될 때까지 나라의 이름과 수도를 입력받아 저장하고 다시 나라의 이름을
//		입력하면 수도를 출력하는 프로그램을 작성하시오. 다음의 해시맵을 이용하라.
		HashMap<String, String> nations = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);

		nations.put("KOR", "서울");
		nations.put("JAP", "도쿄");
		nations.put("CHN", "베이징");
		nations.put("USA", "워싱턴");

		System.out.println("나라이름과 수도를 입력하세요. (예: KOR 서울)");

		while (true) {
			System.out.print("나라 이름, 수도 >> ");
			String country = sc.next();
			if (country.equals("그만"))
				break;

			String capital = sc.next();
			nations.put(country, capital);

			System.out.println("수도 검색을 시작합니다. (그만을 입력하면 종료)");
			while (true) {
				System.out.print("나라 이름>>");
				String name = sc.next();
				if (name.equals("그만"))
					break;

				String capital1 = nations.get(name);
				if (capital1 == null) {
					System.out.println(name + " 나라는 없습니다");
				} else {
					System.out.println(name + "의 수도는 " + capital1);
				}
			}
//		_____________________________________________________
//		나라이름과 수도를 입력하세요. (예 : Korea 서울)
//		나라 이름, 수도>> Korea 서울
//		나라 이름, 수도>> USA 워싱턴
//		나라 이름, 수도>> England 런던
//		나라 이름, 수도>> France 파리
//		나라 이름, 수도>> 그만
//		수도 검색 >> France
//		France의 수도는 파리
//		수도 검색 >> 스위스
//		스위스 나라는 없습니다.
//		수도 검색>>그만
//		End
//		------------------------------------------------------
		}
	}
}
