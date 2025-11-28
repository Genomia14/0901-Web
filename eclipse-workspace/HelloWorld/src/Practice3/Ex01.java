package Practice3;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	1. 배열 입력 & 출력
//	크기 5의 정수 배열을 만들고, 사용자에게 5개의 정수를 입력받아 배열에 저장한 뒤 출력하세요.
		Scanner sc = new Scanner(System.in);
		int[] intArr = new int[5];
		System.out.print("숫자 5개를 입력해 주세요>>");
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = sc.nextInt();
				}
//	intArr[0] = sc.nextInt();
//	intArr[1] = sc.nextInt();
//	intArr[2] = sc.nextInt();
//	intArr[3] = sc.nextInt();
//	intArr[4] = sc.nextInt();
		
		for(int i: intArr) {
			System.out.print(i + " ");
		}
	}
}
