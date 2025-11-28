package chapter23;

import java.util.Arrays;
import java.util.List;

public class Ex04_Sorted {

	public static void main(String[] args) {
		List <String> list = Arrays.asList("홍길동", "멀린", "해리포터", "전우치");

		list.stream()
		.sorted() // 기본값인 사전순 오름차순 정렬
//	forEach : 리스트 안의 데이터를 하나씩 꺼내어 람다식의 코드를 실행하는 메서드
		.forEach(n -> System.out.print(n + "\t"));
		
		System.out.println();
		
		list.stream()
//	람다식으로 Comparator인터페이스를 구현하여 정렬 조건 변경
		.sorted((a,b) -> a.length() - b.length()) // 기본값인 글자수 내림차순 정렬
		.forEach(n -> System.out.print(n + "\t"));

		System.out.println();
		
		list.stream()
		.sorted((a,b) -> b.length() - a.length()) // 기본값인 글자수 내림차순 정렬
		.forEach(n -> System.out.print(n + "\t"));
	}

}
