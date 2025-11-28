package Practice7;

// 제조사, 가격, 통신타입(2g 또는 3g)
class Phone {
	private String made;
	private int cost;
	private int type;

	Phone(String made, int cost, int type2) {
		this.made = made;
		this.cost = cost;
		this.type = type2;
	}

	public String getMade() {
		return made;
	}

	public void setMade(String made) {
		this.made = made;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}

// 운영체제 타입, 운영체제 버전, 내부 메모리크기, 카메라 장착 여부, 블루투스 지원 여부
class SmartPhone extends Phone {
	private String ostype;
	private int osversion;
	private int size;
	private String camera;

	public String getOstype() {
		return ostype;
	}

	public void setOstype(String ostype) {
		this.ostype = ostype;
	}

	public int getOsversion() {
		return osversion;
	}

	public void setOsversion(int osversion) {
		this.osversion = osversion;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getCamera() {
		return camera;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}

	public String getBlue() {
		return blue;
	}

	public void setBlue(String blue) {
		this.blue = blue;
	}

	private String blue;

	SmartPhone(String made, int cost, int type, String ostype, int osversion, int size, String camera, String blue) {
		super(made, cost, type);
		this.ostype = ostype;
		this.osversion = osversion;
		this.size = size;
		this.camera = camera;
		this.blue = blue;
	}

	void print() {
		System.out.println("제조사 = " + getMade());
		System.out.println("가격 = " + getCost());
		System.out.println("통신타입 = " + getType() + "g");
		System.out.println("운영체제 타입 = " + getOstype());
		System.out.println("운영체제 버전 = " + getOsversion());
		System.out.println("내부 메모리 크기 = " + getSize() + "gb");
		System.out.println("카메라 장착 여부 = " + getCamera());
		System.out.println("블루투스 지원 = " + getBlue());
	}
}

public class Q5 {

	public static void main(String[] args) {
		SmartPhone smartphone = new SmartPhone("삼성", 100000, 3, "Linux", 11, 100, "no", "yes");
		smartphone.print();
//		5. 일반적인 휴대폰을 나타내는 Phone 클래스를 작성한다. Phone에는 제조사, 가격, 통신타
//		입(2g 또는 3g) 등의 정보가 저장되어 있다. Phone에서 상속받아서 SmartPhone 클래스
//		를 작성하여 보자. SmartPhone 클래스에는 운영체제 타입, 운영체제 버전, 내부 메모리
//		크기, 카메라 장착 여부, 블루투스 지원 여부 등의 필드가 추가된다. 생성자, 접근자, 설
//		정자를 포함하여서 각각의 클래스를 작성한다. 이들 클래스들의 객체를 만들고 각 객체
//		의 모든 정보를 출력하는 테스트 클래스를 작성하라. 
	}

}
