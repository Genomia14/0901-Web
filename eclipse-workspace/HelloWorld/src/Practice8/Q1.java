package Practice8;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class Q1 {

	public static void main(String[] args) {
//	1. 학점(‘A’, ‘B’, ‘C’, ‘D’, ‘F’)을 컬렉션에 저장하라.
//	그러고 나서 컬렉션을 검색하여 학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0.0)로
//	변환하여 출력하는 프로그램을 작성하라.
//	1) Vector 컬렉션을 이용
		Vector<String> list1 = new Vector<>();
		Scanner sc = new Scanner(System.in);

		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		list1.add("F");

		System.out.println("학점 목록 : " + list1);

//		for (String credit : list1) {
//			double score = 0;
//			if(credit.equals("A")) {
//				System.out.println("A = 4.0 입니다");
//			} else if(score.equals("B")) {
//				System.out.println("B = 3.0 입니다");
//			}else if(score.equals("B")) {
//				System.out.println();
						
		
		
		for (String credit : list1) {
			double score = 0;

			switch (credit) {
			case "A":
				score = 4.0;
				break;
			case "B":
				score = 3.0;
				break;
			case "C":
				score = 2.0;
				break;
			case "D":
				score = 1.0;
				break;
			case "F":
				score = 0.0;
				break;
			default:
				System.out.println("잘못된 학점 : " + credit);
				continue;

			}
			System.out.println(credit + " = " + score);
		}

		System.out.println("--------------------");

//		2) HashMap 컬렉션을 이용
		HashMap<String, Double> list2 = new HashMap<>();

		list2.put("A", 4.0);
		list2.put("B", 3.0);
		list2.put("C", 2.0);
		list2.put("D", 1.0);
		list2.put("F", 0.0);

		System.out.print("A ~ F사이의 점수 입력 >> ");
		String data = sc.next();
		System.out.println(data + "입력한 학점 = " + list2.get(data));
//		System.out.println("입력한 학점 = " + list2.get("B"));

	}
}