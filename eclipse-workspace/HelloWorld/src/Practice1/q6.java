package Practice1;

import java.util.Scanner;

public class q6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원짜리 동전,
		// 100원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇 개로 변환되는지 출력하라.
		// 힌트 참조.
		// 돈의 액수를 입력하세요>>65245
		// 오만원1개, 만원1개, 천원5개, 500원0개, 100원2개, 10원4개, 1원5개
		// 힌트)정수 n의 값이 36이라고 할 때 정수 3과 6을 분리하는
		// 																		방법은 다음 코드를 참고하라.
		// int first = n/10; // 10으로 나눈 몫 = 3
		// int second = n%10; // 10으로 나눈 나머지 = 6
		Scanner sc = new Scanner(System.in);
		System.out.println("돈의 액수를 입력하세요>>");
		int n = sc.nextInt();
		
		int m50000 = n/50000;
		n = n%50000; // 나머지 15245원
		int m10000 = n/10000;
		n = n%10000; // 나머지 5245원
		int m1000 = n/1000;
		n = n%1000; // 나머지 245원
		int m500 = n/500;
		n = n%500; // 나머지 245원
		int m100 = n/100;
		n = n%100; // 나머지 45원
		int m10 = n/10;
		n = n%10; // 나머지 5원
		int m1 = n/1;
		n = n%1; // 나머지 0원
		System.out.println("오만원권" + m50000 + "개, " + "만원권" + m10000 + "개, "
				 + "천원권" + m1000 + "개, " + "500원" + m500 + "개, " + "100원" + m100
				 + "개, " + "10원" + m10 + "개, " + "1원권" + m1 + "개");
		
	}

}
