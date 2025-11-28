package Practice4;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	1. 영문 소문자를 하나 입력받고 그 문자보다 알파벳 순위가 낮은 모든 문자를 출력하는
//	프로그램을 작성하라. [목적-2중 중첩 반복문 연습]
//	알파벳 한 문자를 입력하세요>>e
//	abcde
//	bcde
//	cde
//	de
//	e
//  97 ~ 101
//	Scanner로 문자를 읽을 때 다음과 같이 하면 된다.
//	String s = scanner.next(); // 문자열로 읽음
//	char c = s.charAt(0); // 문자열의 첫 번째 문자
		Scanner sc = new Scanner(System.in);
		System.out.print("a ~ e 중 한 글자를 입력하세요 >>");
		String s = sc.next(); // 문자열로 읽음
		char c = s.charAt(0); // 문자열의 첫 번째 문자
		// 소문자 a는 숫자 97로 저장됨
		// c = e = 101
		// 반복문으로
		// 97 ~ 101까지
		// 97 ~ 100까지
		// 97 ~ 99까지
		// 97 ~ 98까지
		// 97
//		for (char a = num; a <= c; a++) {
//		for (char num = 'a'; num <= c; a++) {
//				System.out.print(num);
//			}
//			System.out.println();
//		}
//	}
//}

//	----------------------

 if (c < 'a' || c > 'e') {
			System.out.println("범위 안에서 입력하세요");
		} else {
			for (char ch = 'a'; ch < c; ch++) {
				System.out.print(ch);
			}
		}
	}
}
//	----------------------
