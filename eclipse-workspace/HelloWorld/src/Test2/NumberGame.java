package Test2;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("문제 1");
		System.out.println();

		int number = (int) ((Math.random() * 100) + 1);
		int count = 0;

		System.out.println(" === 숫자맞추기 게임을 시작합니다. === ");
		System.out.println("컴퓨터가 숫자를 생각했습니다.");
		System.out.println("힌트는" + (number % 2 == 0 ? "짝수" : "홀수" + "입니다."));

		while (true) {
			System.out.print("1 ~ 100 사이의 값을 입력 >> ");
			int asw = sc.nextInt();
			count++;
			
			
			if (asw < number) {
				System.out.println("더 큰 수입니다.");
			} else if (asw > number) {
				System.out.println("더 작은 수 입니다.");
			} else {
				System.out.println(count + "회 만에 맞췄습니다.");
				System.out.println(" === 게임을 종료합니다. === ");
				break;
			}
		}
	}

}
