package chapter6;

public class Ex04_while1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while 반복문 : 몇번 반복할지 정해져 있지 않은 경우 사용하는 반복문
//		int 초기값 = 1;
//		while(조건식) {
//			증감식;
//			반복해서 실행할 코드;
//		}
		int i = 1;
		while (i <= 4) {
			System.out.print(i + ", ");
			i++;
		}
		System.out.print(i);
		System.out.println();
		int j = 0;
		while (j < 5) {
			j++;
			System.out.print(j + ", ");
		}
		System.out.println();
		// 100에서 110까지 출력하는 while문 작성하기

		int a = 100;
		while (a <= 110) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		// 2에서 9까지 출력하는 while문 작성하기

		int b = 2;
		while (b <= 9) {
			System.out.print(b + " ");
			b++;
		}
		System.out.println();
		// 10에서 1까지 출력하는 while문 작성하기

		int c = 10;
		while (c > 0) {
			System.out.print(c + " ");
			c--;
		}
		System.out.println();
		// 5,10,15를 출력하는 while문 작성하기

		int d = 0;
		while (d < 15) {
			d += 5;
			System.out.print(d + " ");
		}
	}
}
