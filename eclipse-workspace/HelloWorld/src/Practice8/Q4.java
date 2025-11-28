package Practice8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class Student {
//	이름, 학과, 학번, 학점
	private String name;
	private String dept;
	private int sno;
	private double score;

//	생성자
	public Student(String name, String dept, int sno, double score) {
		this.name = name;
		this.dept = dept;
		this.sno = sno;
		this.score = score;
	}

//	Getter, Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

}

public class Q4 {

	public static void main(String[] args) {
//		4. 학생정보를 나타내는 Student클래스에 이름, 학과, 학번, 학점을 저장하는 필드를 작성하라.
//		(1) 학생 객체를 생성하고 5명을 학생정보를 ArrayList<Student>컬렉션에 저장한 후에,
//		ArrayList<Student>의 모든학생(5명) 정보를 출력하고 학생의 이름을 입력받아 해당 학생의 학생정
//		보를 출력하는 프로그램을 작성하라.
		ArrayList<Student> studentList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("학생이름, 학과, 학번, 학점을 입력하세요.");
		for (int i = 0; i < 5; i++) {
			System.out.print(">> ");
			String name = sc.next();
			String dept = sc.next();
			int sno = sc.nextInt();
			double score = sc.nextDouble();
			Student s = new Student(name, dept, sno, score);
			studentList.add(s);
		}
		for (Student student : studentList) {
			System.out.println("---------------------");
			System.out.println("이름 : " + student.getName());
			System.out.println("학과 : " + student.getDept());
			System.out.println("학번 : " + student.getSno());
			System.out.println("학점 : " + student.getScore());
		}
		String name = "";
		while (true) {
			System.out.print("학생 이름>>");
			name = sc.next();
			if (name.equals("그만")) {
				break;
			}
			for (Student student : studentList) {
				if (name.equals(student.getName())) {
					System.out
							.println(student.getName() + "," + student.getDept() + "," + student.getSno() + "," + student.getScore());
				}
			}
		}
//		학생정보를 나타내는 Student클래스에 이름, 학과, 학번, 학점을 저장하는 필드를 작성하라.
//		학생 객체를 생성하고 5명을 학생정보를 HashMap<String, Student>컬렉션에 저장한 후에,
//		HashMap<String, Student>의 모든학생(5명) 정보를 출력하고 학생의 이름을 입력받아 해당 학생의 학생정
//		보를 출력하는 프로그램을 작성하라.

		HashMap<String, Student> student2 = new HashMap<>();

		System.out.println("학생이름, 학과, 학번, 학점을 입력하세요.");
		for (int i = 0; i < 5; i++) {
			System.out.print(">> ");
			String name2 = sc.next();
			String dept2 = sc.next();
			int sno2 = sc.nextInt();
			double score2 = sc.nextDouble();
			Student s2 = new Student(name2, dept2, sno2, score2);
			studentList.add(s2);
			student2.put(name2, s2);
		}

		Set<String> ks = student2.keySet();
//	전체 인원 출력 코드
		for (String name3 : ks) {
			System.out.println("---------------------");
			System.out.println("이름 : " + student2.get(name3).getName());
			System.out.println("학과 : " + student2.get(name3).getDept());
			System.out.println("학번 : " + student2.get(name3).getSno());
			System.out.println("학점 : " + student2.get(name3).getScore());
		}

		String name2 = "";
		while (true) {
			System.out.print("학생 이름 >> ");
			name2 = sc.next();
			if (name2.equals("그만")) {
				break;
			}
			if (student2.containsKey(name2)) {
				Student s = student2.get(name2);
				System.out.println(s.getName() + "," + s.getDept() + "," + s.getSno() + "," + s.getScore());
			} else {
				System.out.println("해당하는 학생이 없습니다.");
			}
		}
	}
}
//		-출력결과---------------------------------------
//		학생이름, 학과, 학번, 학점을 입력하세요.
//		>> 홍길동 모바일 1 4.1
//		>> 이재문 안드로이드 2 3.9
//		>> 김남윤 웹공학 3 3.5
//		>> 최찬미 빅데이터 4 4.25
//		>> 정영웅 컴퓨터공학 5 3.0
//		----------------------------------------
//		이름 : 홍길동
//		학과 : 모바일
//		학번 : 1
//		학점 : 4.1
//		-----------------------------
//		이름 : 이재문
//		학과 : 안드로이드
//		학번 : 2
//		학점 : 3.9
//		------------------------------
//		이름 : 김남윤
//		학과 : 웹공학
//		학번 : 3
//		학점 : 3.5
//		----------------------------
//		이름 : 최찬미
//		학과 : 빅데이터
//		학번 : 4
//		학점 : 4.25
//		----------------------------
//		이름 : 정영웅
//		학과 : 컴퓨터공학
//		학번 : 5
//		학점 : 3.0
//		----------------------------
//		학생 이름 >> 최찬미
//		최찬미, 빅데이터, 4, 4.25
//		학생 이름 >> 이재문
//		이재문, 안드로이드, 2, 3.9
//		학생 이름 >> 그만
