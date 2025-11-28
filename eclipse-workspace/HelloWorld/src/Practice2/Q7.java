package Practice2;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		7. 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
//   *
//  ***
// *****
//*******
// *****
//  ***
//   *
		int f = 4;
		int g = 2;
		for (int i = 1; i <= 7; i += 2) {
			for (int a = 1; a <= f; a++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			f--;
		}
		for (int i = 1; i <= 5; i += 2) {
			for (int b = 1; b <= g; b++) {
				System.out.print(" ");
			}
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
			g++;
		}
	}
}
