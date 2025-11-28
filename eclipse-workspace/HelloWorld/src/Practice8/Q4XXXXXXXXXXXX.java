package Practice8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student1 {

	private String name;
	private String dept;
	private int num;
	private Double credit;

	public Student1(String name, String dept, int num, Double credit) {
		this.name = name;
		this.dept = dept;
		this.num = num;
		this.credit = credit;
	}

	public String getName() {
		return name;
	}

	public void print() {
		System.out.println("---------------------------");
		System.out.println("이름 : " + name);
		System.out.println("학과 : " + dept);
		System.out.println("학번 : " + num);
		System.out.println("학점 : " + credit);
	}
}

public class Q4XXXXXXXXXXXX {

	public static void main(String[] args) {
//		4. 학생정보를 나타내는 Student클래스에 이름, 학과, 학번, 학점을 저장하는 필드를 작성하라.
//		(1) 학생 객체를 생성하고 5명을 학생정보를 ArrayList<Student>컬렉션에 저장한 후에,
//		ArrayList<Student>의 모든학생(5명) 정보를 출력하고 학생의 이름을 입력받아
//		해당 학생의 학생정보를 출력하는 프로그램을 작성하라.
		Scanner sc = new Scanner(System.in);
		List<Student1> list = new ArrayList<>();

		list.add(new Student1("홍길동", "모바일", 1, 4.1));
		list.add(new Student1("이재문", "안드로이드", 2, 3.9));
		list.add(new Student1("김남윤", "웹공학", 3, 3.5));
		list.add(new Student1("최찬미", "빅데이터", 4, 4.25));
		list.add(new Student1("정영웅", "컴퓨터공학", 5, 3.0));

		System.out.println("-출력결과--------------------");
		System.out.println(">> 홍길동 모바일 1 4.1");
		System.out.println(">> 이재문 안드로이드 2 3.9");
		System.out.println(">> 김남윤 웹공학 3 3.5");
		System.out.println(">> 최찬미 빅데이터 4 4.25");
		System.out.println(">> 정영웅 컴퓨터공학 5 3.0");
		System.out.print("학생의 이름을 입력해주세요 >> ");
		String name = sc.nextLine();
				
		for (Student1 str1 : list) {
			if(str1.getName().equals(name)) {
				str1.print();
				break;
			}
			System.out.println();
		}
	}
}
	

//		(2) ArrayList<Student> 대신, HashMap<String, Student> 해시맵을 이용하여 다시 작성하라. 해시
//		맵의 키(key)는 학생이름으로 한다


