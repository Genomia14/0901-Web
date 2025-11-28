package Practice2;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4. 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
//		*****
//		****
//		***
//		**
//		*
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
}	