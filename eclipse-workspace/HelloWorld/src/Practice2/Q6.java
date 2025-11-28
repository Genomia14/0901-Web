package Practice2;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6. 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
// *******
//  *****
//   ***
//    *
		
		int f = 4;
		for (int i = 1; i <= 7; i+=2) {
			for(int a = 1; a <= f; a++) {
				System.out.print(" ");
			}
			for (int j = 7; j >= i; j--) {
			System.out.print("*");
			}
			System.out.println();
			f++;
		}
	}
}	