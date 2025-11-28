package Practice2;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 구구단을 짝수단만 출력하도록 프로그램을 만들어 보세요
		// 사용 . (continue )
		// 단수를 설정한 for문
		for (int a = 2; a <= 9; a++) {
			// 단수에 2를 나누어 나머지가 0이 아니면 continue를 실행하여
			// 다음 단으로 넘어감
			if (a % 2 != 0) {
				continue;
			}
			// 곱하는 수를 반복하는 for문
			for (int b = 1; b <= 9; b++)
				System.out.println(a + " x " + b + " = " + (a * b));

		}
		System.out.println();
	}
}
