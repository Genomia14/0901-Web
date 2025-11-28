package Practice3;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	2. 최대값 & 최소값 찾기
//	정수 배열이 주어졌을 때, 배열 안에서 최댓값과 최솟값을 찾아 출력하세요.
//	int[] arr = {10,70,50,90,60,30,20};
//	int max = Integer.MIN_VALUE; 배열의 0번째값, int에 저장 가능한 가장 큰 값
//	int min = Integer.MAX_VALUE; 배열의 0번째값, int에 저장 가능한 가장 작은 값
		int[] arr = { 10, 70, 50, 90, 60, 30, 20 };
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
//	stream을 이용한 최대값 구하기
//	int streamMax = Arrays.stream(arr).streamMax().getAsInt();
//	System.out.println("최대값 : " + max);
//	stream을 이용한 최소값 구하기
//	int streamMin = Arrays.stream(arr).min().getAsInt();
//	System.out.println("최소값 : " + streamMin);
	}
}
