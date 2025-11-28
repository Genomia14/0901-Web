package Practice7;

// 이름, 학번, 소속 학과, 학년, 이수 학점 수
class Student2 {
	private String name; // 이름
	private int studno; // 학번
	private String dept; // 학과
	private int grade; // 학년
	private int credit; // 학점

	Student2(String name, int studno, String dept, int grade, int credit) {
		this.name = name;
		this.studno = studno;
		this.dept = dept;
		this.grade = grade;
		this.credit = credit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudno() {
		return studno;
	}

	public void setStudno(int studno) {
		this.studno = studno;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

}

// 학부생 / 소속 동아리명
class UnderGraduate extends Student2 {
	private String club;

	UnderGraduate(String name, int studno, String dept, int grade, int credit, String club) {
		super(name, studno, dept, grade, credit);
		this.club = club;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	void print() {
		System.out.println("이름 : " + getName() + " / 학번 : " + getStudno() + " / 학과 : " + getDept() + " / 학년 : " + getGrade()
				+ " / 이수학점 : " + getCredit() + " / 소속 동아리 : " + getClub());
	}
}

// 대학원생 / 조교 유형과 장학금 비율 
class Graduate extends Student2 {
	private String edu;
	private boolean res;

	Graduate(String name, int studno, String dept, int grade, int credit, String edu, boolean res) {
		super(name, studno, dept, grade, credit);
		this.edu = edu;
		this.res = res;
	}

	void print() {
		System.out.println("이름 : " + getName() + " / 학번 : " + getStudno() + " / 학과 : " + getDept() + " / 학년 : " + getGrade()
				+ " / 이수학점 : " + getCredit() + " / 조교유형 : " + getEdu() + " / 장학금 여부 : " + getRes());
	}

	public String getEdu() {
		return edu;
	}

	public void setEdu(String edu) {
		this.edu = edu;
	}

	public boolean isRes() {
		return res;
	}
//	장학금 여부를 글자로 출력하는 메서드
	public String getRes() {
		return res ? "받음" : "못받음";
	}

//	지원여부 출력 메서드
//	public String getBool(boolean bool) {
//		return bool ? "받음" : "못받음";
//	}
	
	public void setRes(boolean res) {
		this.res = res;
	}

}

public class Q6 {

	public static void main(String[] args) {
		UnderGraduate underGraduate1 = new UnderGraduate("갑", 1000, "컴공", 3, 84, "날자날어");
		UnderGraduate underGraduate2 = new UnderGraduate("갑", 1000, "컴공", 3, 87, "돌고돌아");
		underGraduate2.print();
		underGraduate1.print();
		Graduate graduate1 = new Graduate("을", 100, "전자공학", 2, 51, "교육 조교", false);
		Graduate graduate2 = new Graduate("병", 102, "세포생물", 3, 61, "연구 조교", true);
		graduate1.print();
		graduate2.print();
	}
}

//		6. 다음 그림에 해당하는 클래스를 작성하여 보자. 모든 학생은 이름, 학번, 소속 학과, 학
//		년, 이수 학점 수를 가진다. 추가적으로 학부생은 소속 동아리명을 가지고 있고 대학원생
//		은 조교 유형과 장학금 비율을 가진다. 조교 유형에는 교육 조교와 연구 조교가 있으며
//		장학금 비율은 0과 1사이의 값이다. 각 클래스는 적절한 생성자 메소드, 접근자 메소드, 변경자 메소드를 가진다. 이러한 클래스들의 객체를 만들고 각 객체의 모든 정보를 출력
//		하는 테스트 클래스를 작성하라

//	graduate1.toString();
//	graduate2.toString();
//	=================출력결과===================
//	이름:갑/ 학번:1000/ 학과:컴공/ 학년:3/ 이수학점:84/ 소속동아리:날자날어
//	이름:갑/ 학번:1000/ 학과:컴공/ 학년:3/ 이수학점:87/ 소속동아리:돌고 돌아
//	이름:을/ 학번:100/ 학과:전자공학/ 학년:2/ 이수학점:51/ 조교 유형: 교육 조교/ 장학금 여부 :못받음
//	이름:병/ 학번:102/ 학과:세포생물/ 학년:3/ 이수학점:61/ 조교 유형: 연구 조교/ 장학금 여부 :받음
//	==========================================
