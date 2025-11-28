package Practice7;

// 이름, 주소, 전화번호
class Person {
	private String name;
	private String address;
	private int phone1;

	Person(String name, String address, int phone1) {
		this.name = name;
		this.address = address;
		this.phone1 = phone1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone1() {
		return phone1;
	}

	public void setPhone1(int phone1) {
		this.phone1 = phone1;
	}
}

// 고객번호와 마일리지
class Customer extends Person {
	private int phone2;
	private int milage;

	Customer(String name, String address, int phone1, int phone2, int milage) {
		super(name, address, phone1);
		this.phone2 = phone2;
		this.milage = milage;
	}

	public int getPhone2() {
		return phone2;
	}

	public void setPhone2(int phone2) {
		this.phone2 = phone2;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	void print() {
		System.out.println("이름 = " + getName());
		System.out.println("주소 = " + getAddress());
		System.out.println("전화번호 = " + getPhone1());
		System.out.println("고객번호 = " + getPhone2());
		System.out.println("마일리지 = " + getMilage());
	}
}

public class Q2 {

	public static void main(String[] args) {
		Customer customer = new Customer("홍길동", "서울", 12345678, 13579, 3000);
		customer.print();
//		2. Person 클래스를 설계하라. Person 클래스는 이름, 주소, 전화 번호를 필드로 가진다. 
//		하나 이상의 생성자를 정의하고 각 필드에 대하여 접근자와 설정자 메소드를 작성하라. 
//		이어서 Person을 상속받아서 Customer를 작성하여 보자. Customer는 고객 번호와 마일리지를 필드로 가지고 있다.
//		한 개 이상의 생성자를 작성하고 적절한 접근자 메소드와 설정자 메소드를 작성한다.
//		이들 클래스들의 객체를 만들고 각 객체의 모든 정보를 출력하는 테스트 클래스를 작성하라.
	}

}
