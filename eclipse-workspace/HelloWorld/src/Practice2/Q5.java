package Practice2;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5. 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
//		  *
//		 ***
//	  *****
//	 *******
		// 4줄을 출력하는 반복문
		int f = 3; // 줄수
		for (int i = 1; i <= 7; i += 2) {
			// 공백을 출력하는 반복문 3,2,1,0
			for (int a = 1; a <= f; a++) {
				System.out.print(" ");
			}
			// 별을 출력하는 반복문
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			f--;
		}
	}
}