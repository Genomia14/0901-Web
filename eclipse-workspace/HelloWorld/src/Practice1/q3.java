package Practice1;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//  x 값을 입력받아 y = x²-3x+7 식을 계산하여 y 값을 출력하는 프로그램을 작성하라.
		//		x 값을 입력하세요>>5
		//		x=5, y=17
		System.out.print("x 값을 입력하세요>>");
		int x = sc.nextInt();
		int y = ((x*x) - (3*x) + 7);
		System.out.println("X="+ x +", y=" + y);
	}

}
