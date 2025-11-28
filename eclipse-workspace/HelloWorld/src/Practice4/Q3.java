package Practice4;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	3. 정수를 입력받아 짝수이면 “짝”, 홀수이면 “홀”을 출력하는 프로그램을 작성하라. 
//	사용자가 정수를 입력하지 않는 경우에는 프로그램을 종료하라.
//	정수를 입력하세요>>352
//	짝수
//	i % 2 == 0
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("정수를 입력하세요 >> ");
			if (sc.hasNextInt()) {
				int a = sc.nextInt();

				if (a % 2 == 0) {
					System.out.println(a + "는 짝수입니다.");
				} else if (a % 1 == 0) {
					System.out.println(a + "는 홀수입니다.");
				}
			} else {
				System.out.println("정수가 아닙니다.");
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
	}
}

//Integer[] intArr = {17, 3, 9, -6, 77, 234, 5, 23 ,-3, 1};
//Arrays.sort(intArr, new Comparator<Integer>()){
//public int compare(Integer o1, Integer o2) {
//	return o2-o1;
//};
//});
//System.out.println(Array.toString(intArr));
