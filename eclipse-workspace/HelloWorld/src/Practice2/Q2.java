package Practice2;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만
		// 출력하는 프로그램을 만들어 보세요 
		// 사용. (break )
		
for (int i = 1; i <= 4; i++) {
	for (int j = 1; j <= i; j++) {
		int sum = i * j;
		System.out.println( i +" x "+ j + " = " + sum);
			}
	System.out.println();
		}
	}
}
