package Practice4;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	5.정수를 10개 입력받아 배열에 저장하고 오름차순으로 정렬하여 출력하라.
//	[목적-배열과 for 반복문 연습] [난이도 중]
//   정수 10개 입력>>17 3 9 -6 77 234 5 23 -3 1
//	 -6 -3 1 3 5 9 17 23 77 234
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.print("정수 10개를 입력하세요 >> ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// 배열에 저장된 내용을 출력하는 반복문	
		Arrays.sort(arr);
		
		System.out.println();
		System.out.println("오름차순 정렬");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
