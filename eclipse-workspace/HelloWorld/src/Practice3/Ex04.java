package Practice3;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	4. 배열 뒤집기
//	정수 배열을 뒤집어서 출력하세요.
//	(예: [1, 2, 3, 4, 5] → [5, 4, 3, 2, 1])
		int[] intArr = {1,2,3,4,5};
		for(int i = 4; i >= 0; i--) {
			System.out.println(intArr[i]);
		}
//		intArr[0] = 1;
//		intArr[1] = 2;
//		intArr[2] = 3;
//		intArr[3] = 4;
//		intArr[4] = 5;
//		
//		System.out.println(intArr[4]);
//		System.out.println(intArr[3]);
//		System.out.println(intArr[2]);
//		System.out.println(intArr[1]);
//		System.out.println(intArr[0]);
	}

}
