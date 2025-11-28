package Practice7;

import java.sql.Date;

// 제목, 페이지수, 저자
class Book {
	private String title;
	private int page;
	private String man;

	Book(String title, int page, String man) {
		this.title = title;
		this.page = page;
		this.man = man;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getMan() {
		return man;
	}

	public void setMan(String man) {
		this.man = man;
	}
}

// 발매일
class Magazine extends Book {
	private Date date;

	Magazine(String title, int page, String man, Date date) {
		super(title, page, man);
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	void print() {
		System.out.println("제목 = " + getTitle());
		System.out.println("페이지 = " + getPage());
		System.out.println("저자 = " + getMan());
		System.out.println("발매일 = " + getDate());
	}
}// 제목, 페이지, 저자

public class Q3 {

	public static void main(String[] args) {
		Magazine magazine = new Magazine("모비딕", 110, "홍길동", Date.valueOf("2025-5-15"));
		Magazine magazine2 = new Magazine("모비딕2", 110, "홍길동2", Date.valueOf("2025-5-15"));
		magazine.print();
		System.out.println();
		magazine2.print();

//		3. 일반적인 책을 나타내는 Book 클래스를 상속받아서 잡지를 나타내는 Magazine 클래스
//		를 작성하여 보자. Book 클래스는 제목, 페이지수, 저자 등의 정보를 가진다. Magazine
//		클래스는 추가로 발매일 정보를 가진다. 생성자, 접근자, 설정자를 포함하여서 각각의 클
//		래스를 작성한다. 이들 클래스들의 객체를 만들고 각 객체의 모든 정보를 출력하는 테스
//		트 클래스를 작성하라. 
	}
}
